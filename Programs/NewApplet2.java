

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Frame;

class SampleFrame extends Frame
{
    SampleFrame(String title)
    {
        
        super(title);
    }
   public void paint(Graphics g )
   {
       g.setColor(Color.PINK);
       g.drawString("सुस्वागतम ", 50, 100);
       setBackground(Color.green);
   }
}

public class NewApplet2{
    public static void main (String[]args)throws Exception
    {
        SampleFrame f = new SampleFrame  ( " MyFrame");
        f.setSize(300,300);
        f.setVisible(true);
        Thread.sleep(5000);
        f.setVisible(false);
    }
}


