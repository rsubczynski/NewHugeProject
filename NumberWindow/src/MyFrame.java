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
               
               //Dodanie przycisku OK
               JButton b=new JButton("Oblicz");  
                  b.setBounds(200,200,95,30);  
                  frame.add(b);  
                  frame.setSize(400,400);  
                  frame.setLayout(null);  
                  frame.setVisible(true);
            }
         });
   }
}

/**
 * Ramka z przykładowš etykietš tekstowš i listš rozwijanš umożliwiajšcš wybór kroju czcionki.
 */
class ComboBoxFrame extends JFrame
{
   public ComboBoxFrame()
   {
      setTitle("ComboBoxTest");
      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      // Dodanie tekstu etykiety.
      label = new JLabel("WYNIK");
      label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
      add(label, BorderLayout.CENTER);
      
      label2 = new JLabel("WWWWWWWWWWW");
      label2.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
      add(label2, BorderLayout.WEST);

      // Tworzenie listy rozwijanej i dodawanie nazw czcionek.

      faceCombo = new JComboBox();
      faceCombo.setEditable(true);
      faceCombo.addItem("Serif");
      faceCombo.addItem("SansSerif");
      faceCombo.addItem("Monospaced");
      faceCombo.addItem("Dialog");
      faceCombo.addItem("DialogInput");

      // Słuchacz listy rozwijanej zmienia krój pisma etykiety na czcionkę wybranš przez użytkownika.

      faceCombo.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               label.setFont(new Font((String) faceCombo.getSelectedItem(), Font.PLAIN,
                     DEFAULT_SIZE));
            }
         });

      // Dodanie listy rozwijanej do panelu znajdujšcego się przy południowej krawędzi ramki.

      JPanel comboPanel = new JPanel();
      comboPanel.add(faceCombo);
      add(comboPanel, BorderLayout.SOUTH);
      
   }

   public static final int DEFAULT_WIDTH = 300;
   public static final int DEFAULT_HEIGHT = 200;

   private JComboBox faceCombo;
   private JLabel label;
   private JLabel label2;
   private static final int DEFAULT_SIZE = 12;
}