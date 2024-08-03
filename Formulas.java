
/**
 * Write a description of class Formulas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Formulas
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Formulas
     */
    public Formulas()
    {
        // initialise instance variables
        int x = 2;
        int y = 3;
        int p = 5;
        
        System.out.println(5*x);
        System.out.println((6*x) + y);
        System.out.println(x + (y/3));
        System.out.println(7*x + y/x+2);
        System.out.println(4 * (3 + 2) - 3 * 5);
        System.out.println(7 / 3);
        System.out.println(7 % 3);
        System.out.println((int)27.6);
        System.out.println(23/ 4 / 2.0 + 18 / 5 + 1.5);
        System.out.println (29 % (4 + 5) * 7 % 20);
        System.out.println(p+=3);
        
        int n = 3;
    System.out.println("n = " + n);	 
    n++;	
    System.out.println("n = " + n);	 
    ++n;	
    System.out.println("n = " + (--n)); 
 
    



    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
