import java.util.Scanner;
class planet
{
  long distance;
  long satelite;
  int oneday;
  planet()
  {
    satelite=0;
    oneday=24;
  }
  planet(long distance)
  {
    this();
    this.distance=distance;
  }
  planet(long x,long y)
  {
    this(x);
    satelite=y;
  }
}
