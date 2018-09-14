package h05;

import java.applet.*;
import java.awt.*;

public class DrawingsVar extends Applet
{

    Color lijn;
    Color opvul;
    int breedte;
    int hoogte;

    public void init()
    {
        opvul = Color.green;
        lijn = Color.black;
        hoogte = 50;
        breedte = 80;

    }

    public void paint(Graphics g)
    {
        g.drawLine(20,20, 100, 20);
        g.drawRect(20, 40, 80, 50);
        g.drawRoundRect(20, 110, 80, 50, 45, 45);

        g.setColor(opvul);
        g.fillRect(120, 40, breedte, hoogte);
        g.setColor(lijn);
        g.drawArc(120, 40,breedte,hoogte,360, 360);

        g.setColor(opvul);
        g.fillArc(120, 110, breedte, hoogte, 360, 360);

        g.setColor(lijn);
        g.drawArc(220, 40, breedte, hoogte, 360, 360);
        g.setColor(opvul);
        g.fillArc(220, 40, breedte, hoogte, 90, 45);

        g.setColor(lijn);
        g.drawArc(230, 110, breedte, hoogte, 90, 360);
    }

}
