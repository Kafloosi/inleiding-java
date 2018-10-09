package h11;

import java.applet.Applet;
import java.awt.*;

public class HundredCircles extends Applet
{
    int x, y, circle, w, h;

    public void init()
    {

    }

    public void paint(Graphics g)
    {
        x = 100;
        y = 100;
        w = 600;
        h = 600;

        for(circle = 0; circle < 100; circle++)
        {
            w -= 10;
            h -= 10;
            x += 10;
            y += 10;

            g.drawArc(x, y, w, h, 360, 360);
        }
    }
}
