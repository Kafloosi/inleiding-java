package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BTW extends Applet
{

    TextField text;
    Button button;
    double btw;
    double user;


    public void init()
    {
        text = new TextField("Type hier het bedrag exclusief BTW", 40);
        button = new Button("ok");
        button.addActionListener(new ButtonListener());
        add(text);
        add(button);

    }

    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double answer;
            double result;

            answer = Double.parseDouble(text.getText());
            result = answer * 1.21;
            Double.toString(result);

            text.setText(Double.toString(result));

        }
    }

}
