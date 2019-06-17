
import java.applet.Applet;
import java.awt.Label;
import java.awt.Graphics;
import java.awt.Checkbox;
import java.awt.Button;
import java.awt.event.*;
import java.awt.CheckboxGroup;

public class Cheackboxdemo extends Applet implements ItemListener {

    Checkbox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8;
    CheckboxGroup cbg = new CheckboxGroup();
    CheckboxGroup cbg1 = new CheckboxGroup();

    public void init() {
        cb1 = new Checkbox("1", cbg, true);
        cb2 = new Checkbox("3", cbg, false);
        cb3 = new Checkbox("5", cbg, false);
        cb4 = new Checkbox("7", cbg, false);
        cb5 = new Checkbox("2", cbg1, true);
        cb6 = new Checkbox("4", cbg1, false);
        cb7 = new Checkbox("6", cbg1, false);
        cb8 = new Checkbox("8", cbg1, false);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);
        cb5.addItemListener(this);
        cb6.addItemListener(this);
        cb7.addItemListener(this);
        cb8.addItemListener(this);
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(cb5);
        add(cb6);
        add(cb7);
        add(cb8);
    }

    public void itemStateChanged(ItemEvent ae) {

        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("CurrentState1", 10, 100);
        String msg1 =  cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg1, 10, 120);
        g.drawString("CurrentState2", 10, 160);

        String msg2 =  cbg1.getSelectedCheckbox().getLabel();

        g.drawString(msg2, 10, 180);
        int sum = Integer.parseInt(msg1) + Integer.parseInt(msg2);
       
        g.drawString("ADDITION:" + sum, 10, 200);

    }
}
