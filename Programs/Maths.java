/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;
class NewThread /*implements Runnable*/extends Thread {
//Thread t ;
    int num1 ;
NewThread(String name,int num1){
 //t = new Thread(this, name) ;   
 this.num1 = num1 ;
start();
}
public void run(){
for(int i = 0;i<5;i++)
{
 try{
     if(num1==1)
          System.out.println("Square of "+i+ " : "+i*i);
     else
         System.out.println("CUBE of "+i+ " : "+i*i*i);
         
   Thread.sleep(1000);}
 
  catch(Exception e){}
  System.out.println(Thread.currentThread()+" : "+i);}
 }
}

public class Maths {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        new NewThread("FIRST ",1) ;
        new NewThread("SECOND ",2) ;
        for(int i = 0;i<5;i++){
        System.out.println("MAIN (square root of): "+i+" "+Math.sqrt(i) );
        Thread.sleep(1000) ;
        }// TODO code application logic here
    }
    
}
