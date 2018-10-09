package h11;

import java.applet.Applet;
import java.awt.*;

public class FiftyCircles extends Applet
{
    int x, y, circle, w, h;

    public void init()
    {

    }

    public void paint(Graphics g)
    {
        x = 100;
        y = 100;
        w = 300;
        h = 300;

        for(circle = 0; circle < 50; circle++)
        {
            w -= 10;
            h -= 10;
            x += 5;
            y += 5;

            g.drawArc(x, y, w, h, 360, 360);
        }
    }
}
