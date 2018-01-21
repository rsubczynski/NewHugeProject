
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Main
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

    private static final int DEFAULT_WIDTH = 800;
    private static final int DEFAULT_HEIGHT = 200;
    private JComboBox faceCombo, faceCombo2 ;
    private JLabel label;
    private Button button;
    private ArrayList<Stade> stadeArrayList = new ArrayList<>();
    private int caschPositions;

    public ComboBoxFrame()
    {
        stadeArrayList.add(new Stade("Alabama",4));
        stadeArrayList.add(new Stade("Blabama",2));
        stadeArrayList.add(new Stade("Clabama",3));



        setTitle("ComboBoxTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);


        button = new Button("=");
        final JLabel endingPrice = new JLabel("Cena Koncowa");
        final JLabel percent = new JLabel("%");
        final JLabel result = new JLabel("Wyliczenie");




        faceCombo2 = new JComboBox();
        faceCombo2.setEditable(true);
        for(Integer i : Generator.GenerateNumberList()) {
            faceCombo2.addItem(i);
        }

        faceCombo = new JComboBox();
        faceCombo.setEditable(true);
        for(Stade i : stadeArrayList) {
            faceCombo.addItem(i.name);
            caschPositions = i.getPrecent();
        }

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                float wynik =0;

                int liczba =  (int) faceCombo2.getSelectedItem();
                Stade stade = stadeArrayList.get(faceCombo.getSelectedIndex());

                int procent = stade.getPrecent();

                float wynikProcentowy =  procent/100f;
                float cos = 1 + wynikProcentowy;

                wynik = (liczba / cos);

                result.setText(String.valueOf(wynik));

            }
        });

        JPanel comboPanel = new JPanel();
        comboPanel.add(faceCombo);
        add(comboPanel, BorderLayout.BEFORE_FIRST_LINE);
        comboPanel.add(percent);

        JPanel comboPanel2 = new JPanel();
        comboPanel.add(faceCombo2);
        add(comboPanel2, BorderLayout.CENTER);

        button.setSize( 50, 75 );
        comboPanel.add(endingPrice);
        comboPanel.add(button);

        comboPanel.add(result);

    }
}
