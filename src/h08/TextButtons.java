package h08;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class TextButtons extends Applet
{

    TextField text;
    Button button;
    Button buttonR;
    String s;

    public void init()
    {
        text = new TextField(" ", 40);
        button = new Button("ok");
        button.addActionListener(new ButtonListener());
        add(text);
        add(button);

        buttonR = new Button("reset");
        buttonR.addActionListener(new ResetListener());
        add(buttonR);
    }

    public void paint(Graphics g)
    {
        g.drawString(""+s,20,40);

    }

    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            s = text.getText();
            repaint();
        }
    }

    class ResetListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            text.setText("");
            s = "";
            repaint();
        }
    }

}
