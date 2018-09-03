package h02;

import java.applet.*;
import java.awt.*;

public class CallName extends Applet
{
    public void init()
    {
        setBackground(Color.white);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawString("Luuk", 50, 60);
        g.setColor(Color.red);
        g.drawString("de Vos", 80, 60);
    }
}
