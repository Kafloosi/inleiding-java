package h04;

import java.applet.Applet;
import java.awt.*;

public class Flag extends Applet
{
    public void init()
    {

    }

    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.fillRect(20,20,500,300);
        g.setColor(Color.white);
        g.fillRect(20,20,500,200);
        g.setColor(Color.RED);
        g.fillRect(20, 20, 500, 100);
    }
}
