import java.util.Scanner;
class Planet
{
  long distance;
  long satelite;
  int oneday;
  Planet()
  {
    satelite=0;
    oneday=24;
  }
  Planet(long distance)
  {
    this();
    this.distance=distance;
  }
  Planet(long x,long y)
  {
    this(x);
    satelite=y;
  }
}
class Myplanet
{
   public static void main(String args[])
  {
   Planet earth=new Planet(5353536346L);
   Planet p=new Planet(452L,96L);
   System.out.println("distance ::"+earth.distance);
   System.out.println("satelite :"+earth.satelite);
   System.out.println("oneday:"+earth.oneday);
   System.out.println("distance ::"+p.distance);
   System.out.println("satelite :"+p.satelite);
   System.out.println("oneday:"+p.oneday);
  }
}
   

