
import java.applet.Applet;
import java.awt.Label;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.*;
import java.awt.CheckboxGroup;

public class Text1 extends Applet implements ActionListener{
 
TextField name,pass;
    public void init() {
      
       Label namep = new Label("name:",Label.LEFT);
       Label passp = new Label("pass:",Label.LEFT);
       name = new TextField(12);
       pass = new TextField(8);
       pass.setEchoChar('*');
       setLayout(null);
       namep.setBounds(10,20,100,20);
        name.setBounds(10,50,100,20);
        passp.setBounds(10,70,100,20);
        pass.setBounds(10,90,100,20);
       add(namep);
       add(name);
       add(passp);
       add(pass);
       
       name.addActionListener(this);
       pass.addActionListener(this);
    }
    

    
    public void actionPerformed(ActionEvent ae)
            
    {
                repaint();
    }

    public void paint(Graphics g) {
        g.drawString("name:"+name.getText(),10,100);
        g.drawString("password:"+pass.getText(),10,120);
       
    }
}
