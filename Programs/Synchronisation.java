/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package synchronisation;

class JavaProg{
synchronized void display(String name,int num){
   System.out.print(name + " : <"+num);
   try{
    Thread.sleep(100) ;
     }
    catch(InterruptedException e){}
   System.out.println(">");
  }
}


    class NewThread implements Runnable {
    String msg ;
    JavaProg tar ;
    Thread t ;
    public NewThread(JavaProg targ ,String s){
 tar = targ;
 msg = s;
 t = new Thread(this) ;
 t.start(); ;
 }
    public void run(){
for(int i = 0;i<5;i++)
{
tar.display(msg, i);
 }
    }
    }
           
            class Synchronisation {
    public static void main(String[] args) throws InterruptedException{
        JavaProg obj = new JavaProg() ;
      NewThread ob1 = new NewThread(obj, " FIRST") ;
      NewThread ob2 = new NewThread(obj, " SECOND") ;
      NewThread ob3 = new NewThread(obj, " THIRD") ;
    }
    
}
