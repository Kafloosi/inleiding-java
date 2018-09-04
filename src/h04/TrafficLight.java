package h04;

import java.applet.Applet;
import java.awt.*;

public class TrafficLight extends Applet
{
    public void init()
    {

    }

    public void paint(Graphics g)
    {
        g.setColor(Color.DARK_GRAY);
        g.fillRoundRect(20, 20, 100, 275, 90, 90);
        g.setColor(Color.red);
        g.fillArc(45, 50, 50, 50, 90, 360);
        g.setColor(Color.yellow);
        g.fillArc(45, 125, 50, 50, 90, 360);
        g.setColor(Color.green);
        g.fillArc(45, 200, 50, 50, 90, 360);
    }
}
