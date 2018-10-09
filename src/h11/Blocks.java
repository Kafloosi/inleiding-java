package h11;

import java.applet.Applet;
import java.awt.*;

public class Blocks extends Applet
{
    int x, y, counter;

    public void init()
    {

    }

    public void paint(Graphics g)
    {
        x = 20;
        y = 20;

        for(counter = 0; counter < 5; counter++)
        {
            x += 40;
            y += 40;

            g.drawRect(x, y, 40, 40);
        }
    }
}
