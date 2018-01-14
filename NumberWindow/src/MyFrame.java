import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @version 1.33 2007-06-12
 * @author Cay Horstmann
 */
public class MyFrame
{
   public static void main(String[] args)
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {

               ComboBoxFrame frame = new ComboBoxFrame();
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setVisible(true);
            }
         });
   }
}

class ComboBoxFrame extends JFrame
{
   public ComboBoxFrame()
   {
      setTitle("ComboBoxTest");
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);


      button = new Button("*");
      JLabel label1 = new JLabel("Tutaj bedzie wynik");
      


      faceCombo = new JComboBox();
      faceCombo.setEditable(true);
      for(Integer i : Generator.GenerateNumberList()) {
    	  faceCombo.addItem(i);
      }
      
      
      faceCombo2 = new JComboBox();
      faceCombo2.setEditable(true);
      for(Integer i : Generator.GenerateRandomNumberList()) {
    	  faceCombo2.addItem(i);
      }


      button.addActionListener(new ActionListener()
      {
    	  public void actionPerformed(ActionEvent e)
    	  {
    		  
    		  int wynik = (int)faceCombo2.getSelectedItem() * (int)faceCombo.getSelectedItem();
    		  
    		  label1.setText(String.valueOf(wynik));
    		  
    	  }
    	});

      JPanel comboPanel = new JPanel();
      comboPanel.add(faceCombo);
      add(comboPanel, BorderLayout.BEFORE_FIRST_LINE);
      
      JPanel comboPanel2 = new JPanel();
      comboPanel.add(faceCombo2);
      add(comboPanel2, BorderLayout.CENTER);
     
      button.setSize( 50, 75 );
      comboPanel.add(button);
      comboPanel.add(label1);
   }

   public static final int DEFAULT_WIDTH = 500;
   public static final int DEFAULT_HEIGHT = 400;
   private int  liczbaPierwsza2 = 0;
   private int  liczbaPierwsza = 0 ;
   private JComboBox faceCombo, faceCombo2 ;
   private JLabel label;
   private Button button;
   private static final int DEFAULT_SIZE = 12;
}