package h04;

import java.applet.*;
import java.awt.*;

public class Weights extends Applet
{
    public void init()
    {

    }

    public void paint(Graphics g)
    {
        g.drawLine(20, 20, 20, 220);
        g.drawLine(20,220,220, 220);
        g.drawString("0", 0, 220);
        g.drawString("20", 0, 180);
        g.drawString("40", 0, 140);
        g.drawString("60", 0, 100);
        g.drawString("80", 0, 60);
        g.drawString("100", 0, 20);

        g.setColor(Color.RED);
        g.fillRect(40, 140, 40,80);
        g.setColor(Color.black);
        g.drawString("Valerie", 40, 240);
        g.setColor(Color.blue);
        g.fillRect(100, 20, 40, 200);
        g.setColor(Color.black);
        g.drawString("Jeroen", 100, 240);
        g.setColor(Color.yellow);
        g.fillRect(160, 60, 40, 160);
        g.setColor(Color.black);
        g.drawString("Hans", 165, 240);

    }
}
