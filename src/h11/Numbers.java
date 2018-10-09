package h11;

import java.applet.Applet;
import java.awt.*;

public class Numbers extends Applet
{

    public void init()
    {

    }

    public void paint(Graphics g)
    {
        int counter;
        int y = 0;

        for(counter = 10; counter < 21; counter++)
        {
            y +=20;
            g.drawString("" + counter, 10, y);
        }
    }
}