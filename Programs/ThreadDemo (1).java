/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threaddemo;
class NewThread /*implements Runnable*/extends Thread {
//Thread t ;
NewThread(String name){
 //t = new Thread(this, name) ;   
 
start();
}
public void run(){
for(int i = 0;i<5;i++)
{
 try{
   Thread.sleep(1000);}
 
  catch(Exception e){}
  System.out.println(Thread.currentThread()+" : "+i);}
 }
}

public class ThreadDemo {

    public static void main(String[] args) throws Exception{
        new NewThread("FIRST ") ;
        new NewThread("SECOND ") ;
        for(int i = 0;i<5;i++){
        System.out.println("MAIN : "+i );
        Thread.sleep(1000) ;
        }
    }
}
