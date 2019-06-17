
package simple;

import java.util.Scanner;
public class Trycatchexample {

    
    public static void main(String[] args) {
      Scanner in =new Scanner(System.in);
      System.out.println("enter number you want t0 add");
      int n =in.nextInt();
      int a[]=new int[n];
      System.out.println("enter elements");
      for( int f=0;f<4;f++)
      {
       a[f]=in.nextInt();
      }
      
      int i;
      System.out.println("enter numbers");
      try
      {
          for(i=0;i<5;i++)
          {
              System.out.println(a[i]+"");
              
          }
          
      }
      catch(ArrayIndexOutOfBoundsException g)
      {
          System.out.println("out of bound");
          g.printStackTrace();
      }
      System.out.println("priogtam end");
    }
    
}
