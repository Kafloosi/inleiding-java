package h06;

import java.applet.Applet;
import java.awt.*;

public class NegativeInt extends Applet
{

    int value1;
    int value2;
    int value3;

    public void init()
    {
        value1 = 15;
        value2 = 20;
        value3 = -50 + value1 + value2;
    }

    public void paint(Graphics g)
    {

        g.drawString("-50 + " + value1 + " + " + value2 + " = " + value3, 20, 20);

    }

}
