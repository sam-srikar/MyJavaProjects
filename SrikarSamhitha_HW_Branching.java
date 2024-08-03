/**
 * A program that takes in 3 user inputs (times scored on a race by 3 runners) and outputs the placement, range and average scored.
 * 
 * by Samhitha Srikar
 * 
 * 01/31/24
 * 
 */
import java.util.Scanner;
import java.lang.Math;
public class SrikarSamhitha_HW_Branching {
    
        public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the race times (in seconds):");
        s.useDelimiter("\\s");
        
        // user inputs
        double t1 = s.nextDouble();
        double t2 = s.nextDouble();
        double t3 = s.nextDouble();
        
        // output methods
        double placement = racerPlacement(t1, t2, t3);
        
        double overlap = timeOverlap(t1, t2, t3);
        
        double range = calculateRange(t1, t3);
        
        double average = calculateAverage(t1, t2, t3);
        

        s.close();
    }
        
        /** variables for reference:
         * t1 = user input for 1st participants time
         * t2 = user input for 2nd participants time
         * t3 = user input for 3rd participants time
         * p1 = first place
         * p2 = second place
         * p3 = third place
         */
        
        // method that displays the placemnt of each runner based on time
    public static double racerPlacement(double t1, double t2, double t3){
        double p1 = Math.min(t1, Math.min(t2, t3));
        double p3 = Math.max(t1, Math.max(t2, t3));
        double p2 = (t1 + t2 + t3 - p1 - p3);
        
        System.out.println("First place (time in seconds): " + p1);
        System.out.println("Second place (time in seconds): " + p2);
        System.out.println("Third place (time in seconds): " + p3);
        return 0;
    }
        
    
        // swap method with a temporary variable
    public static void swapVals(double a, double b) {
            double temp = a;
            a = b;
            b = temp;
        } 
        
        
        //method to calculate and display time overlap
        public static double timeOverlap(double t1, double t2, double t3){
        double p1 = Math.min(t1, Math.min(t2, t3));
        double p3 = Math.max(t1, Math.max(t2, t3));
        double p2 = (t1 + t2 + t3 - p1 - p3);
        double prec = 1e-10; // precison point for doubles so comparing error doesn't occur
        
                if (Math.abs(t1 - t2) < prec && Math.abs(t2 - t3) < prec && Math.abs(t3 - t1) < prec) {
        System.out.println("All are tied for first place.");
    } else if (Math.abs(t1 - t2) > prec && Math.abs(t2 - t3) > prec && Math.abs(t1 - t3) > prec) {
        System.out.println("None are tied for first place ");
    } else if (Math.abs(t1 - p1) < prec || Math.abs(t2 - p1) < prec || Math.abs(t3 - p1) < prec) {
        System.out.println("Some are tied for first place.");
    } else {
        System.out.println("None are tied for first place ");
    }
        
                if (Math.abs(t1 - t2) < prec && Math.abs(t2 - t3) < prec && Math.abs(t3 - t1) < prec) {
        System.out.println("All are tied for second place.");
    } else if (Math.abs(t1 - t2) > prec && Math.abs(t2 - t3) > prec && Math.abs(t1 - t3) > prec) {
        System.out.println("None are tied for second place ");
    } else if (Math.abs(t1 - p2) < prec || Math.abs(t2 - p2) < prec || Math.abs(t3 - p2) < prec) {
        System.out.println("Some are tied for second place.");
    } else {
        System.out.println("None are tied for second place ");
    }
        
                if (Math.abs(t1 - t2) < prec && Math.abs(t2 - t3) < prec && Math.abs(t3 - t1) < prec) {
        System.out.println("All are tied for third place.");
    } else if (Math.abs(t1 - t2) > prec && Math.abs(t2 - t3) > prec && Math.abs(t1 - t3) > prec) {
        System.out.println("None are tied for third place ");
    } else if (Math.abs(t1 - p3) < prec || Math.abs(t2 - p3) < prec || Math.abs(t3 - p3) < prec) {
        System.out.println("Some are tied for third place.");
    } else {
        System.out.println("None are tied for third place ");
    }
        return 0;
    }
        
    
        // method to calculate range
    public static double calculateRange(double t1, double t3) {
            double rng = (t3 - t1);
            System.out.println("The range of the race times (in seconds): " + rng);
            return 0;
        }
    
        // method to calculate average
    public static double calculateAverage(double t1, double t2, double t3) {
            double avg = ((t1 + t2 + t3) / 3);
            System.out.println("The average time of all racers (in seconds): " + avg);
            return 0;
        }
        
        
    }
    
