package h11;

import java.applet.Applet;
import java.awt.*;

public class Chess extends Applet
{
    int x, y, width, hight;

    public void init()
    {
    width=50;
    hight = 50;
    }

    public void paint(Graphics g)
    {
        int kolom =0;
        for (int x = 0; x < 8; x++)
        {
            for (int y = 0;8 > y; y++)
            {
                if(kolom % 2 ==0)
                {
                    g.setColor(Color.black);
                    g.fillRect(x*50, y*50, width, hight);
                }
                else
                {
                    g.setColor(Color.white);
                    g.fillRect(x*50, y*50, width, hight);
                }
                kolom++;
            }
            kolom++;
        } 
        g.drawRect(0, 0, 399, 399);
    }
}