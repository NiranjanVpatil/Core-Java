import java.util.Scanner;
class Circle
{
  int radius;
  float perimeter;
  float area;
}
class Mycircle
{
  public static void main(String args[])
  {
      final float pi=3.14f;
      Circle  c = new circle();  
      Scanner in = new Scanner(System.in);
      System.out.print("enter radius: ");
      c.radius=in.nextInt();
      c.perimeter =2.0f*pi*(float) c.radius;
      c.area=pi*(float)(c.radius*c.radius);
      System.out.println("perimeter  :"+c.perimeter);
      System.out.println("area : "+c.area);
  }
}   
