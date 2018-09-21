package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonthYearNumbers extends Applet
{
    int jan, feb, mrt, apr, mei, jun, jul, aug, sep, okt, nov, dec;
    TextField textMonth, textYear;
    Button ok;
    Label label;
    String userInputMonth, userInputYear;
    String textOutMonth, textOutYear;
    int month, year;


    public void init()
    {
        System.out.println("initialised");

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

        setSize(500,200);
        label = new Label("Type hier de maandnummer!");
        add(label);
        textMonth = new TextField();
        textMonth.setColumns(5);
        add(textMonth);

        label = new Label("Type hier het jaartal!");
        add(label);
        textYear = new TextField();
        textYear.setColumns(5);
        add(textYear);

        ok = new Button("Ok");
        ButtonOkListener BOL = new ButtonOkListener();
        ok.addActionListener(BOL);
        add(ok);

    }

    public void paint(Graphics g)
    {
        System.out.println("paint initialised");
        g.drawString("" + textOutMonth + " " + textOutYear, 70, 100);
    }

    class ButtonOkListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            userInputMonth = textMonth.getText();
            month = Integer.parseInt(userInputMonth);
            userInputYear = textYear.getText();
            year = Integer.parseInt(userInputYear);
            switch(month)
            {
                case 1:
                    textOutMonth = "Maand 1, Januari, heeft 31 dagen.";
                    textOutYear = "Het jaar is " + year;
                    repaint();
                    break;
                case 2:
                    if ( (year % 4 == 0 && !(year % 100 == 0)) ||
                            year % 400 == 0 ) {
                        textOutYear = year + " is een schrikkeljaar";
                        textOutMonth = "Maand 2, Februari heeft 29 dagen";
                        repaint();
                    }
                    else {
                        textOutYear = year + " is geen schrikkeljaar";
                        textOutMonth = "Maand 2, Februari heeft 30 dagen";
                        repaint();
                        }
                    repaint();
                    break;
                case 3:
                    textOutMonth = "Maand 3, Maart, heeft 31 dagen.";
                    textOutYear = "Het jaar is " + year;
                    repaint();
                    break;
                case 4:
                    textOutMonth = "Maand 4, April, heeft 30 dagen.";
                    textOutYear = "Het jaar is " + year;
                    repaint();
                    break;
                case 5:
                    textOutMonth = "Maand 5, Mei, heeft 31 dagen.";
                    textOutYear = "Het jaar is " + year;
                    repaint();
                    break;
                case 6:
                    textOutMonth = "Maand 6, Juni, heeft 30 dagen.";
                    textOutYear = "Het jaar is " + year;
                    repaint();
                    break;
                case 7:
                    textOutMonth = "Maand 7, Juli, heeft 31 dagen.";
                    textOutYear = "Het jaar is " + year;
                    repaint();
                    break;
                case 8:
                    textOutMonth = "Maand 8, Augustus, heeft 30 dagen.";
                    textOutYear = "Het jaar is " + year;
                    repaint();
                    break;
                case 9:
                    textOutMonth = "Maand 9, September, heeft 31 dagen.";
                    textOutYear = "Het jaar is " + year;
                    repaint();
                    break;
                case 10:
                    textOutMonth = "Maand 10, Oktober, heeft 30 dagen.";
                    textOutYear = "Het jaar is " + year;
                    repaint();
                    break;
                case 11:
                    textOutMonth = "Maand 11, November, heeft 31 dagen.";
                    textOutYear = "Het jaar is " + year;
                    repaint();
                    break;
                case 12:
                    textOutMonth = "Maand 12, December, heeft 30 dagen.";
                    textOutYear = "Het jaar is " + year;
                    repaint();
                    break;
                default:
                    textOutMonth = "U hebt een verkeerd nummer ingetikt ..!";
                    textOutYear = "";
                    repaint();
                    break;
            }
        }
    }
}
