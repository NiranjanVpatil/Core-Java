import java.util.Scanner;
class Maths
{
  
  int length;
  int value;
  float radius;
  int breadth;
  float key;
  int area( int length)
  {
    value=length*length;
    return (value);
  }
  int area( int length, int breadth)
  {
    value=length*breadth;
    return(value);
  }
  float area( float radius)
  {
    key=(3.14f*radius*radius);
    return (key);
  }
}
class Area
{
  public static void main(String args[])
  {
    int num,num1,num3,num4;
    float num2;
    Maths s =new Maths();
    System.out.println("1=area of square ,2=area of circle,3=area of rectangle"); 
    Scanner in =new Scanner(System.in);
    System.out.println("enter what area you want ::" );
    num=in.nextInt();
    switch(num)
    {
     case 1:
        System.out.println("enter length:");
        num1=in.nextInt();
        System.out.println("area of square is .."+s.area(num1));
        break;
     case 2:
        System.out.println("enter radius:");
        num2=in.nextFloat();
        System.out.println("area of square is .."+s.area(num2));
        break;
      case 3:
        System.out.println("enter length:");
        num3=in.nextInt();
        System.out.println("enter breadth:");
        num4=in.nextInt();
        System.out.println("area of square is .."+s.area(num3,num4));
        break;
     }
   }
}
        
     
