import java.util.Scanner;
class Principal
{
     void message()
          {
            System.out.print("This is principal. ");
          }
}
class Professor extends Principal
{
     void message()
          {
            System.out.print("This is Professor. ");
          }
}
class Lecturer extends Professor
{
     void message()
          {
            System.out.print("This is Lecturer. ");
          }
}
class Dynamic
{
  public static void main(String args[])
{
     Principal x=new Principal(); 
     Professor y=new Professor();
     Lecturer z=new Lecturer();
     Principal ref;
       ref=x;
       ref.message();
       ref=y;
       ref.message();
       ref=z;
        ref.message();
}
}
