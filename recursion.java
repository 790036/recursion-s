
/**
 * Write a description of class recursion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class recursion
{
    // 1. Base case 
    private int x;

    // 
    public static void fun(int x)
{
   if(x > 0)
   {
      System.out.print(x);
 	    fun(x-1);
   }
}

}
