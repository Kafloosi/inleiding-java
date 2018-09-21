package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HighestNumber extends Applet
{

    String number;
    TextField text;
    Button button;
    double userInput;
    double previousInput;

    public void init()
    {
        setSize(350,100);
        text = new TextField("Type hier je getal");
        add(text);

        button = new Button("Ok");
        UserInputListener UIL = new UserInputListener();
        button.addActionListener(UIL);
        add(button);
    }

    public void paint(Graphics g)
    {
        g.drawString("Hoogste getal tot dusver: " + userInput, 100, 50);
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
        }
    }
}
