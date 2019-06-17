/*
 * To change this license header, choose License Headers in Project Properties.* @author student
 * To change this template file, choose Tools | Templates* @author student* @author student
 * and open the template in the editor.* @author student
 */
package mitaoe3;

/**
 ** @author student
 * @author student
 */
public class Third {
   void fact(int number)
    {
        int res=1;
        if(number==1)
        {
            System.out.println("factorial=1");
            
        }
 
        else
        {
            for(int i=1;i<=number;i++)
            {
                res=res*i;
                
                
            }
            System.out.println("Factorial"+res);
        }
        
                
    }
    
}
