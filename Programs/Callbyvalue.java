import java.util.Scanner;
class Test
{
   int a,b;
   void input(Test o)      
   {
     o.a++;
     o.b++;
   }
}
class Callbyvalue
{
    public static void main(String args[])
    {
         Test ob=new Test();
         ob.a=15;
         ob.b=20;
         System.out.print("a and b before call : ");
         System.out.println(ob.a+" "+ob.b);
         ob.input(ob);
         System.out.print("a and b after call : ");
         System.out.println(ob.a+" "+ob.b);
      }
}





