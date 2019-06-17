
import java.applet.Applet;
import java.awt.Label;
import java.awt.Graphics;
import java.awt.Choice;
import java.awt.Button;
import java.awt.event.*;
import java.awt.CheckboxGroup;

public class Choicedemo extends Applet implements ItemListener {
Choice os = new Choice();
Choice os1= new Choice();   

    public void init() {
        os. add("Ubuntu");
        os. add("Fedora");
        os. add("Mint");
        os. add("Kali");
        os.addItemListener(this);
        os1.add("Chrome");
        os1.add("FireFox");
        os1.add("SAfari");
        os1.add("Google");
        os1.addItemListener(this);
        add (os);
        add (os1);
    }

    public void itemStateChanged(ItemEvent ae) {

        repaint();
    }

    public void paint(Graphics g) {
        String s = os.getSelectedItem();
        g.drawString("Your os Is :"+ s,10 , 100);
        String s1 = os1.getSelectedItem();
        g.drawString("Your browers Is :"+ s1,10 , 120);
    }
}
