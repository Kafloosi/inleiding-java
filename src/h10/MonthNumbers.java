package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonthNumbers extends Applet
{
    int jan, feb, mrt, apr, mei, jun, jul, aug, sep, okt, nov, dec;
    TextField text;
    Button ok;
    Label label;
    String userInput;
    String textOut;
    int month;


    public void init()
    {
        jan = 1;
        feb = 2;
        mrt = 3;
        apr = 4;
        mei = 5;
        jun = 6;
        jul = 7;
        aug = 8;
        sep = 9;
        okt = 10;
        nov = 11;
        dec = 12;

        label = new Label("Type hier de maandnummer!");
        add(label);
        text = new TextField();
        text.setColumns(5);
        add(text);
        ok = new Button("Ok");
        ButtonOkListener BOL = new ButtonOkListener();
        ok.addActionListener(BOL);
        add(ok);

    }

    public void paint(Graphics g)
    {
        g.drawString("" + textOut, 70, 100);
    }

    class ButtonOkListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            userInput = text.getText();
            month = Integer.parseInt(userInput);
            if(month == 1)
            {
                textOut = "Maand 1, Januari, heeft 31 dagen.";
                repaint();
            }
            if(month == 2)
            {
                textOut = "Maand 2, Februari, heeft 30 dagen.";
                repaint();
            }
            if(month == 3)
            {
                textOut = "Maand 3, Maart, heeft 31 dagen.";
                repaint();
            }
            if(month == 4)
            {
                textOut = "Maand 4, April, heeft 30 dagen.";
                repaint();
            }
            if(month == 5)
            {
                textOut = "Maand 5, Mei, heeft 31 dagen.";
                repaint();
            }
            if(month == 6)
            {
                textOut = "Maand 6, Juni, heeft 30 dagen.";
                repaint();
            }
            if(month == 7)
            {
                textOut = "Maand 7, Juli, heeft 31 dagen.";
                repaint();
            }
            if(month == 8)
            {
                textOut = "Maand 8, Augustus, heeft 30 dagen.";
                repaint();
            }
            if(month == 9)
            {
                textOut = "Maand 9, September, heeft 31 dagen.";
                repaint();
            }
            if(month == 10)
            {
                textOut = "Maand 10, Oktober, heeft 30 dagen.";
                repaint();
            }
            if(month == 11)
            {
                textOut = "Maand 11, November, heeft 31 dagen.";
                repaint();
            }
            if(month == 12)
            {
                textOut = "Maand 12, December, heeft 30 dagen.";
                repaint();
            }

        }
    }
}
