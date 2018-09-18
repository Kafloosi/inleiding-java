package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Applet
{

    TextField text1, text2;
    Button button1, button2, button3, button4;
    double result;

    String answer1;
    String answer2;

    double getal1;
    double getal2;


    public void init()
    {
        setSize(300, 500);


         text1 = new TextField();
        text1.setColumns(7);
         text2 = new TextField();
        text2.setColumns(7);

         button1 = new Button("+");
        Button1Listener b1 = new Button1Listener();
        button1.addActionListener(b1);

         button2 = new Button("-");
        Button2Listener b2 = new Button2Listener();
        button2.addActionListener(b2);

         button3= new Button("/");
        Button3Listener b3 = new Button3Listener();
        button3.addActionListener(b3);

         button4 = new Button("x");
        Button4Listener b4 = new Button4Listener();
        button4.addActionListener(b4);

        add(text1);
        add(text2);
        add(button1);
        add(button2);
        add(button3);
        add(button4);

    }

    public void paint(Graphics g)
    {

        g.drawString("" + result, 100, 100);

    }


    class Button1Listener implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            answer1 = text1.getText();
            answer2 = text2.getText();

            getal1 = Double.parseDouble(answer1);
            getal2 = Double.parseDouble(answer2);

            result = getal1 + getal2;

            repaint();
        }
    }

    class Button2Listener implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            answer1 = text1.getText();
            answer2 = text2.getText();

            getal1 = Double.parseDouble(answer1);
            getal2 = Double.parseDouble(answer2);

            result = getal1 - getal2;

            repaint();
        }
    }

    class Button3Listener implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            answer1 = text1.getText();
            answer2 = text2.getText();

            getal1 = Double.parseDouble(answer1);
            getal2 = Double.parseDouble(answer2);

            result = getal1 / getal2;

            repaint();
        }
    }

    class Button4Listener implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            answer1 = text1.getText();
            answer2 = text2.getText();

            getal1 = Double.parseDouble(answer1);
            getal2 = Double.parseDouble(answer2);

            result = getal1 * getal2;

            repaint();
        }
    }

}
