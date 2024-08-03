/**
 * A program that takes in the constants of a quadratic function and outputs the x and y coordinates of the vertex of the function's parabola
 *
 * by Samhitha Srikar
 * 
 * 1/24/24
 */
import java.util.Scanner;
public class H2P1
{
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the a, b, and c of your quadratic function (separated by spaces):");
        s.useDelimiter("[\\s]+");
        //a, b and c (inputs by user)
        double a = s.nextInt();
        double b = s.nextInt();
        double c = s.nextInt();
        //x and y that are computed by the program
        double x = (-b/(2*a));
        double y = ((a*x*x)+(b*x) + c);
        //calling zeroException method
        zeroException(x, y);
        //calling vertex exception method
        vertexExceptions(x, y);
        
        
        s.close();
    }

    //condition method that prints statements depending on the input
    public static void vertexExceptions(double x, double y) {
        
      if(x == 0){
          System.out.println("This vertex is also the zero of your parabola.");
      } if(y == 0){
          System.out.println("This vertex is also the y-intercept of your parabola.");
      }
          
    }
    //method that makes sure -0 is remedied
     public static void zeroException(double x, double y) {
        if (formatDouble(x) == 0 && formatDouble(y) == 0) {
            System.out.println("The vertex of the corresponding parabola is: (0, 0)");
        } else if (x != -0.0 && y != -0.0){
        System.out.println("The vertex of the corresponding parabola is: " + "(" + x + ", " + y + ")");
    }
       
    }

    // helper method to format doubles for comparison and printing
    public static double formatDouble(double value) {
        return Math.abs(value); 
    }
        
    
}
