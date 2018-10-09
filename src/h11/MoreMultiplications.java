package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoreMultiplications extends Applet
{
    String userInput, textOut;
    int numberInput, n01, n02;

    Button ok;
    TextField number;

    public void init()
    {
        number = new TextField();
        number.setColumns(5);
        add(number);
        ok = new Button("Ok");
        ok.addActionListener(new MultiplicationListener());
        add(ok);
    }

    public void paint(Graphics g)
    {

    }

    class MultiplicationListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            userInput = number.getText();
            numberInput = Integer.parseInt(userInput);

            if (numberInput == 1)
            {
                numberInput = n01;
                
            }
        }
    }
}
