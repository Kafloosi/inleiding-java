package h06;

import java.applet.Applet;
import java.awt.*;

public class TimeYearApplet extends Applet
{
    int dayAnswer;
    int hourAnswer;
    int yearAnswer;

    public void init()
    {
        dayAnswer = 24;
        hourAnswer = 60;
        yearAnswer = 365;
    }

    public void paint(Graphics g)
    {
        g.drawString("in 1 uur zitten: 60 x 60 = " + hourAnswer * 60 + " seconden", 20, 20);
        g.drawString("In 1 dag zitten:  24 x 60 x 60 = " + dayAnswer * 60 * 60 + " seconden", 20, 40);
        g.drawString("in 1 jaar zitten: 365 x 24 x 60 = " + yearAnswer * 3600 * 24 + " seconden", 20, 60);

    }

}
