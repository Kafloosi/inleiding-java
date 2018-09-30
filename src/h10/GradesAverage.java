package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GradesAverage extends Applet
{
    double userInput, average;
    int amount;
    TextField text;
    Button ok;
    String textInput, grade;

    public void init()
    {
        System.out.println("Initialized");

        text = new TextField();
        add(text);
        ok = new Button("OK");
        ButtonOkListener BOL = new ButtonOkListener();
        ok.addActionListener(BOL);
        add(ok);

    }

    public void paint(Graphics g)
    {
        g.drawString("" + grade, 100, 50);
        g.drawString("Het gemiddelde is: " + average, 100, 70 );

    }

    class ButtonOkListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            textInput = text.getText();
            userInput = Double.parseDouble(textInput);

            if (userInput <= 5)
            {
                grade = "Het cijfer: " + userInput + "is een onvoldoende";
                repaint();
            }
            if (userInput > 5)
            {
                grade = "Het cijfer: " + userInput + "is een voldoende";
                repaint();
            }
            if (userInput >= 11)
            {
                grade = "Het getal dat u heeft ingevuld is incorrect. Kies een cijfer tussen de 1 en de 10!";
                repaint();
            }
            if (userInput <= 0)
            {
                grade = "Het getal dat u heeft ingevuld is incorrect. Kies een cijfer tussen de 1 en de 10!";
                repaint();
            }
                if (average ==0)
                {
                    average = userInput;
                }
                else
                {
                    average = (average + userInput) / 2;
                }
            average = ((int)(average * 10)) / 10D;
        }
    }
}