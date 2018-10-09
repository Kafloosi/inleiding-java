package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class GoodGrades extends Applet
{
    Label labelHeader;
    TextField textFieldNumber;
    Button buttonOk;
    String stringResult;
    double doubleResult;
    boolean clicked;
    DecimalFormat Fmt;


public void init() {
        setSize(235, 75);
        setLayout(null);

        labelHeader = new Label("Fill your grade");
        labelHeader.setBounds(10, 10, 75, 25);
        add(labelHeader);

        textFieldNumber = new TextField("", 4);
        textFieldNumber.addActionListener(new ButtonOkListener());
        textFieldNumber.setBounds(95, 10, 40, 20);
        add(textFieldNumber);

        buttonOk = new Button("Ok");
        buttonOk.addActionListener(new ButtonOkListener());
        buttonOk.setBounds(150, 10, 75, 20);
        add(buttonOk);

        stringResult = "";
        Fmt = new DecimalFormat("#.#");
        }


public void paint(Graphics g) {
        if (clicked) {
        g.drawString("Your grade: " + Fmt.format(doubleResult) + " is " + stringResult, 10, 50);
        }
        }


class ButtonOkListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        clicked = true;
        doubleResult = Double.parseDouble(textFieldNumber.getText());

        if (doubleResult > 0.0) {
            stringResult = "bad";
        }
        if (doubleResult > 3.999) {
            stringResult = "unsatisfactory grade";
        }
        if (doubleResult > 4.999) {
            stringResult = "mediocre";
        }
        if (doubleResult > 5.999) {
            stringResult = "enough";
        }
        if (doubleResult > 7.999) {
            stringResult = "good";
        }
        if (doubleResult > 10.0) {
            stringResult = "wrong";
        }
        if (doubleResult < 0.0) {
            stringResult = "wrong";
        }
        repaint();
    }
}

}