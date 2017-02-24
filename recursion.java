
/**
 * Write a description of class recursion here.
 * 
 * Levi Rutherford
 * @version (a version number or a date)
 */
public class recursion
{
    //
    // Recursion:
    //
    
    // 1. Base case 
    private int x;

    public static void fun1(int x)
{
   if(x > 0)
   {
      System.out.print(x);
        fun1(x-1);
   }
}
    // 2:
    // Expected output: 1
    // Actual output: 1
    //3:
    //Expected: 5432
    //Actual: 54321
    //4:
    //Expected: N/A
    //Actual: N/A
     public static void fun2(int x)
{
   if(x < 5)
   {
      System.out.print(x);
     fun2(x-1);
      System.out.print(x);
   }
}
    //5: 
    //Expected: 45
    //Actual: 44
    //6: 
    //Expected: N/A
    //Actual: N/A
    public static int fun3(int x){
   if(x < 1)
      return 1;
   else
      return x + fun3(x - 1);}
      //7:
      //Expected: 1
      //Actual: 1
      //8:
      //Expected: 7
      //Actual: 11
public static int wacky(int x, int y)
{
   if(x <= 1)
      return y;
   else
      return wacky(x - 1,y - 1) + y;
}
    //9:
    //Expected: 11
    //Actual: 11
    public static int go(int x, int y)
{
   if(x <= 1)
      return y;
   else
      return go(x - 1,y) + y;
}
    //10:
    //Expected: 16
    //Actual: 8
    public static String wow(String s, int pos)
{
   if(pos > s.length())
      return s.substring(0, s.length()/2);
   else
      return s + wow(s.substring(pos), pos + 1);
}
    //11:
    //Expected: Pacmancmanmanann
    //Actual: Pacmancman
    //12: e. II and III only
    //13: c. The method is counting the number of occurrences of x in ray.
    //14: e. The method is counting the number of numbers in ray
    
    //
    //Sorting:
    //
    
    //1. length
    //2. No way to tell without parameters
    //3. Selection sort: 12 5 18 2 9 1 > 1 12 5 18 2 9 > 1 2 12 5 18 9 > 1 2 5 12 18 9 > 1 2 5 9 12 18
    //4. Insertion sort: 12 5 18 2 9 1 > 5 12 18 2 9 1 > 2 5 12 18 9 1 > 2 5 9 12 18 1 > 1 2 5 9 12 18
    //5. 45 swaps maximum
    //6. Merge sort: 12 5 18 2 9 1 > 5 12 = 2 18 = 1 9 > 2 5 12 18 = 1 9 > 1 2 5 9 12 18
    
    // 
    //Abstract Classes and Interfaces
    //
    
    //1. a - False, b - True, c - True, d - True, e - True
    //2. Minimum of 1 method
    //3. c. public abstract double getScore();
    //4. a. x=8
}






















