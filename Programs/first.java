/*
 * To change this license header, choose License Headers in Project Properties.
 * To changchangechanchangechangegechangee changechangethischange template file, choose Tools | Templates
 * and op and open the template in the editor.en the template in the editor.
 */
package mitaoe3;

import java.util.Scanner;
import sycomp.overloading;
public class first {

    public static void main(String[] args) 
    {
       Scanner in =new Scanner(System.in);
       System.out.println("enter leap year :: ");
       int year=in.nextInt();
       Second s =new Second();
       s.isleap(year);
       System.out.println("enter number you want to do factorial:");
       int number=in.nextInt();
       Third t =new Third();
       t.fact(number);
       Fourth f =new Fourth();
       f.display();
       overloading o=new overloading();
        System.out.println("add"+o.add(10));
        System.out.println("add"+o.add(20, 50));
       System.out.println("add"+o.add(10.0f, 20.0f));
       
       
        
    }
    
}
