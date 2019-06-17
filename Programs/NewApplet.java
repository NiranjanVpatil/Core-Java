

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.List;

public class NewApplet extends Applet{
    public void init()
    {
       List os = new List(4,false);
        
        os. add("Ubuntu");
        os. add("Fedora");
        os. add("Mint");
        os. add("Kali");
        
        add (os);
        
        List b  = new List(4,true);
        b.add("Chrome");
        b.add("FireFox");
        b.add("SAfari");
        b.add("Google");
        
        add(b);
        
        
    }
} 
