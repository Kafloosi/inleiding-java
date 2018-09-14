package h06;

import java.applet.Applet;
import java.awt.*;

public class Grades extends Applet
{
    double grade1;
    double grade2;
    double grade3;
    double answer;
    int answerRounded;

    public void init()
    {
        grade1 = 5.9;
        grade2 = 6.3;
        grade3 = 6.9;
        answer = (grade1 + grade2 + grade3) / 3;
        answerRounded = (int) answer;

    }

    public void paint(Graphics g)
    {

        g.drawString("Het gemiddelde is: " + answerRounded, 20, 20);

    }
}
