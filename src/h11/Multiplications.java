package h11;

import java.applet.Applet;
import java.awt.*;

public class Multiplications extends Applet
{
    int multiplication, y, i;

    public void init()
    {

    }

    public void paint(Graphics g)
    {
        y = 0;
        g.drawString(multiplication + " ", 20, y);

        for (i = 1; i <= 10; i++)
        {
            y += 20;
            multiplication = i * 3;
            g.drawString(" " + multiplication, 20, y);

        }
    }
}
