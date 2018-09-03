package h02;

import java.applet.*;
import java.awt.*;

public class Name extends Applet
{
    public void init()
    {
      setBackground(Color.yellow);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawString("Luuk de Vos", 50, 60);
    }
}
