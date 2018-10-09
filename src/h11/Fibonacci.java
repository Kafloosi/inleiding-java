package h11;

import java.applet.Applet;
import java.awt.*;

public class Fibonacci extends Applet
{
    int n1, n2, n3, i, count, y;

    public void init()
    {
        n1 = 0;
        n2 = 1;
        count = 10;
    }

    public void paint(Graphics g)
    {
        y = 0;
        g.drawString(n1 + " " + n2, 20, y);

        for(i=2;i<count;++i)
        {
            y +=20;
            n3=n1+n2;
            g.drawString(" "+n3, 20, y);
            n1=n2;
            n2=n3;
        }

    }
}