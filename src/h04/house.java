package h04;

import java.applet.Applet;
import java.awt.*;

public class house extends Applet
{
    public void init()
    {

    }

    public void paint(Graphics g)
    {
        g.drawPolygon(new int[] {100, 200, 300}, new int[] {200, 20, 200}, 3);
        g.drawRect(100,200,200, 200);
        g.drawRect(225, 300, 40, 100);
        g.drawRect(125, 340, 60, 40);

    }
}
