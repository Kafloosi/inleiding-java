package h02;

import java.awt.*;
import java.applet.*;

public class Show extends Applet
{
    public void init()
    {
        setBackground(Color.pink);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.green);
        g.drawString("Welcome to Java!!", 50, 50);
    }
}
