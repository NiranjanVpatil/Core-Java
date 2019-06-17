import java.util.Scanner;
class Box
{
      int height;
      int width;
      int length;
      Box()
     {
       height=width=length=10;
      }
       Box(int x,int y)
       {
          height=x;
          width=y;
       }
       Box(int x,int y,int z)
        {
           height=x;
            width=y;
            length=z;
         }
}
class Boxclass {
      public static void main(String args[])
        {
              Box a=new Box();
              System.out.println("Width of a :" +a.width);
              Box  b=new Box(12,13);
              System.out.println("height of b :" +b.height);
              Box  c=new Box (1,13,18);
              System.out.println("lenght of c :"+c.length);
         }
}
