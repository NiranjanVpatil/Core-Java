import java.util.scanner;
class Factorial
{
  public static void main(String args[])
  {
      int i,num,fact=1;
      Scanner in =new Scanner(System.in);
      System.out.print("enter the no you wnt to do factorial::");
      int num=in.nextInt();
      for(i=num;i>0;i--)
          fact=fact*i;
      System.out.println("factorial is :"+fact);
   }
}
