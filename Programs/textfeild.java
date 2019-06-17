

import java.applet.Applet;
import java.awt.Label;
import java.awt.Graphics;
//import java.awt.TextField;
import java.awt.Button;
import java.awt.event.*;
public class textfeild extends Applet implements ActionListener{
Button b1, b2;
String msg = "Nothing Press";
    public void init() {
        b1 = new Button("Yes");
        b2 = new Button("No");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add (b1);
        add (b2);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
       String s =ae.getActionCommand(); 
       if(s. equals("Yes"))
           msg ="You PressYes";
       else
           msg = "You PressNOO";
       repaint();
    }
    
    public void paint(Graphics g)
    {
        g.drawString(msg, 10, 100);
    }
}
