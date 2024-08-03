/**
 * A program that calculates GPA
 *
 * by Samhitha Srikar
 * 
 * 1/24/24
 */
public class GradeCalculator {

public static void main(String[]args) { 
double result = times_SIX (2.5); 
double grades = 607.12;
int credits = 175;
System.out.println("This program calculates your average grade based on the number of credits taken.");

System.out.println("Your average grade is "+ grades/credits +" points.");
    
    }
//times_SIX method that returns the result
public static double times_SIX (double x) {
double result =(x*1.6);
return result;
    }
}




