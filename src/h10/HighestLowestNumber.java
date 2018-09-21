package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HighestLowestNumber extends Applet
{

    String number;
    String number2;
    TextField text;
    Button button;
    double userInput;
    double previousInput;
    double userInputLow;
    double previousInputLow;

    public void init()
    {
        setSize(350, 100);
        text = new TextField("Type hier je getal");
        add(text);

        button = new Button("Ok");
        UserInputListener UIL = new UserInputListener();
        button.addActionListener(UIL);
        add(button);
    }

    public void paint(Graphics g)
    {
        g.drawString("Hoogste getal tot dusver: " + previousInput, 100, 50);
        g.drawString("Laagste getal tot dusver: " + previousInputLow, 100, 70);
    }

    class UserInputListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            number = text.getText();
            userInput = Double.parseDouble(number);
            if (userInput > previousInput)
            {
                previousInput = userInput;
                repaint();
            }
            if(previousInputLow == 0){
                previousInputLow=userInput;
                repaint();
            }else if (userInput < previousInputLow)
            {
                previousInputLow = userInput;
                repaint();
            }

        }
    }
}
