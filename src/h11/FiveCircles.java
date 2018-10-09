package h11;

import java.applet.Applet;
import java.awt.*;

public class FiveCircles extends Applet
{
    int x, y, circle, w, h;

    public void init()
    {

    }

    public void paint(Graphics g)
    {
        x = 20;
        y = 20;
        w = 60;
        h = 60;

        for(circle = 0; circle < 5; circle++)
        {
            w -= 10;
            h -= 10;
            x += 10;
            y += 10;

            g.drawArc(x, y, w, h, 360, 360);
        }
    }
}
