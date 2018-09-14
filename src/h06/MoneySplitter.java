package h06;

import java.applet.Applet;
import java.awt.*;

public class MoneySplitter extends Applet
{
    int answer;
    int money;
    //hoeveel mensen
    int amount;

    public void init()
    {
        money = 113;
        amount = 4;

        answer = money / amount;
    }

    public void paint(Graphics g)
    {
        g.drawString("Wie krijgt hoeveel geld?", 20, 20);
        g.drawString("Jan = €" + answer + ",-", 20, 40);
        g.drawString("Ali = €" + answer + ",-", 20, 60 );
        g.drawString("Jeannette = €" + answer + ",-", 20, 80);
        g.drawString("Luuk = €" + answer + ",-", 20, 100);
    }
}
