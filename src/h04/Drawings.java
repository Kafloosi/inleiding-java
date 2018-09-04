package h04;

import java.applet.Applet;
import java.awt.*;

public class Drawings extends Applet
{
    public void init()
    {

    }

    public void paint(Graphics g)
    {
        g.drawLine(20,20, 100, 20);
        g.drawRect(20, 40, 80, 50);
        g.drawRoundRect(20, 110, 80, 50, 45, 45);

        g.setColor(Color.MAGENTA);
        g.fillRect(120, 40, 80, 50);
        g.setColor(Color.black);
        g.drawArc(120, 40,80,50,360, 360);

        g.setColor(Color.magenta);
        g.fillArc(120, 110, 80, 50, 360, 360);

        g.setColor(Color.black);
        g.drawArc(220, 40, 80, 50, 360, 360);
        g.setColor(Color.magenta);
        g.fillArc(220, 40, 80, 50, 90, 45);

        g.setColor(Color.black);
        g.drawArc(230, 110, 50, 50, 90, 360);
    }
}
