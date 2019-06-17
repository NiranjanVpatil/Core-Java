
import java.applet.Applet;
import java.awt.Label;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.*;
import java.awt.CheckboxGroup;

public class Add extends Applet implements ActionListener{
 
TextField n1 , n2;
    public void init() {
      
       Label n1p = new Label("no 1:",Label.RIGHT);
       Label n2p = new Label("no 2:",Label.RIGHT);
       n1 = new TextField(12);
       n2 = new TextField(8);
     
       add(n1p);
       add(n1);
       add(n2p);
       add(n2);
       
       n1.addActionListener(this);
       n2.addActionListener(this);
    }
    

    
    public void actionPerformed(ActionEvent ae)
            
    {
                repaint();
    }

    public void paint(Graphics g) {
        g.drawString("number 1:"+n1.getText(),10,100);
        g.drawString("number 2:"+n2.getText(),10,120);
        
        int sum = Integer.parseInt(n1.getText()) + Integer.parseInt(n2.getText());
         g.drawString("ADDITION:" + sum, 10, 160);
         
         int sub = Integer.parseInt(n1.getText()) - Integer.parseInt(n2.getText());
         g.drawString("SUBTRACTION:" + sub, 10, 180);
         
         int mul = Integer.parseInt(n1.getText()) * Integer.parseInt(n2.getText());
         g.drawString("Multi :" + mul, 10, 200);
         
         int div = Integer.parseInt(n1.getText()) / Integer.parseInt(n2.getText());
         g.drawString("DIV:" + div, 10, 220);
    }
}
