
import java.applet.Applet;
import java.awt.Label;
import java.awt.Graphics;
import java.awt.List;
import java.awt.Button;
import java.awt.event.*;
import java.awt.CheckboxGroup;

public class Listdemo extends Applet implements ItemListener,  ActionListener{
 List os = new List();
 List os1= new List();   
String s = " temporary selection";
    public void init() {
        os. add("Ubuntu");
        os. add("Fedora");
        os. add("Mint");
        os. add("Kali");
        os.addItemListener(this);
        os.addActionListener(this);
        os1.add("Chrome");
        os1.add("FireFox");
        os1.add("SAfari");
        os1.add("Google");
        os1.addItemListener(this);
        os1.addActionListener(this);
        add (os);
        add (os1);
    }

    public void itemStateChanged(ItemEvent ae) {
         s = "temporary selection";
        repaint();
    }
    
    public void actionPerformed(ActionEvent ae)
            
    {
        s= "Permanent Selection";
                repaint();
    }

    public void paint(Graphics g) {
        s = s+os.getSelectedItem();
        String s = os.getSelectedItem();
        g.drawString("Your os Is :"+ s,10 , 100);
        s = s+os1.getSelectedItem();
        String s1 = os1.getSelectedItem();
        g.drawString("Your browers Is :"+ s1,10 , 120);
    }
}
