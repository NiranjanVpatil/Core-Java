import java.util.Scanner;
class Grandfather
{ 
  Grandfather(){
    System.out.println("this is grandfather");
  }
}
class Father extends Grandfather
{
  Father()
  {
    System.out.println("this is father");
  }
}
class Child extends Father
{
  Child()
  {
    System.out.println("this is son");
  }
}
class Callconstructor
{
 public static void main(String args[])
 {
   Child roger=new Child();
  }
}
 

