/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currentthread;

/**
 *
 * @author student
 */
 class CurrentThread {

   
    public static void main(String[] args)
                      throws InterruptedException
    {
        Thread t = Thread.currentThread() ;
        System.out.println("CURRENT THREAD "+t);
        t.setName("PRIME THREAD");
        System.out.println("AFTER THE NAME CHANGE "+t);
        Thread.sleep(3000);
        System.out.println("END OF THE MAIN THREAD & PROGRAM");
                
    }
    
}
