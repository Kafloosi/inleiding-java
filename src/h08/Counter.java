package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends Applet
{

    Button button;
    TextField text;
    int km;
    int kv;
    int vm;
    int vv;

    int kind1;
    int kind2;
    int vol1;
    int vol2;

    int tot;

    public void init()
    {
        kind1 = 0;
        kind2 = 0;
        vol1 = 0;
        vol2 = 0;

        button = new Button("+1 kind man");
        ButtonListener km = new ButtonListener();
        button.addActionListener(km);
            add(button);
        button = new Button("+1 kind vrouw");
        ButtonListener2 kv = new ButtonListener2();
        button.addActionListener(kv);
            add(button);
        button = new Button("+1 volwassen man");
        ButtonListener3 vm = new ButtonListener3();
        button.addActionListener(vm);
            add(button);
        button = new Button("+1 volwassen vrouw");
        ButtonListener4 vv = new ButtonListener4();
        button.addActionListener(vv);
            add(button);

    }

    public void paint(Graphics g)
    {

        g.drawString("kinderlijke mannetjes " + km, 100, 100);
        g.drawString("kinderlijke vrouwtjes " + kv, 100, 120);
        g.drawString("mannetjes " + vm, 100, 140);
        g.drawString("vrouwtjes " + vv, 100, 160);
        g.drawString("Totaal: " + tot, 100, 180);

    }

    class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            km = kind1++;
            tot ++;
            repaint();

        }
    }

    class ButtonListener2 implements ActionListener
    {

        public void actionPerformed(ActionEvent e) {

            kv = kind2++;
            tot ++;
            repaint();

        }
    }
    class ButtonListener3 implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {

            vm = vol1++;
            tot ++;
            repaint();

        }
    }
    class ButtonListener4 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {

            vv = vol2 ++;
            tot ++;
            repaint();

        }
    }

}
