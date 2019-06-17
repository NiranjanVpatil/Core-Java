
package sycomp;
public class overloading {
    int cal;
    float val;
    public int add(int x,int y)
    {
        cal=x+y;
       
        return(cal);
    }
    public int add(int x)
    {
        cal=x+10;
       
        return(cal);
    }
    public float add(float x,float y)
    {
        val=x+y;
        
        return(val);
    }
}
