/**
 * A program to calculate BMI values in kilograms, pounds, meters, and inches in a tabular format.
 *
 * by Samhitha Srikar
 *
 * 1/24/24
 */

public class H1P1 {

    public static void main(String[] args) {
        // Test bmiOne - 5 tests
        System.out.println("\nbmiOne:");
        testBmiOneCase(870, 7.9);
        testBmiOneCase(200, 30.9);
        testBmiOneCase(900, 7.9);
        testBmiOneCase(40, 1.85);
        testBmiOneCase(590, 3.0);

        // Test bmiTwo- 5 tests
        System.out.println("\nbmiTwo:");
        testBmiTwoCase(786, 534);
        testBmiTwoCase(400, 80);
        testBmiTwoCase(1900, 39);
        testBmiTwoCase(700, 800);
        testBmiTwoCase(300, 79);
        
        // Test bmiPrinter- 5 cases
        System.out.println("\nbmiPrinter:");
        bmiPrinter(22.5);  
        bmiPrinter(30.0); 
        bmiPrinter(18.0);  
        bmiPrinter(37.5); 
        bmiPrinter(25.5);  
        
        // Table of values
        System.out.println("  -------------------------------------");
        System.out.println(" |     BMI Value     | BMI Category    |");
        System.out.println(" |-------------------|-----------------|");
        System.out.printf(" | From 16.0 to 18.5 |  Underweight    |%n");
        System.out.printf(" | From 18.5 to 25   |  Normal         |%n");
        System.out.printf(" | From 25 to 30     |  Overweight     |%n");
        System.out.printf(" | From 30 to 35     |  Moderately     |%n");
        System.out.printf(" | From 35 to 40     |  Severely       |%n");
        System.out.println("  -------------------------------------");
        
    }

    // BMI formula for mass in kilograms and height in meters
    public static double bmiOne(double mass, double height) {
        return mass / (height * height);
    }

    // BMI formula for weight in pounds and height in inches
    public static double bmiTwo(double weight, double height) {
        return (weight / (height * height)) * 703;
    }

    // Test for the bmiOne method
    public static void testBmiOneCase(double mass, double height) {
        double bmi = bmiOne(mass, height);
        bmiPrinter(bmi);
    }

    // Test for the bmiTwo method
    public static void testBmiTwoCase(double weight, double height) {
        double bmi = bmiTwo(weight, height);
        bmiPrinter(bmi);
    }


    // Printing BMI information in a tabular format
    public static void bmiPrinter(double bmi) {
        System.out.println("Your BMI value is: " + String.format("%.2f", bmi) + ".");
        System.out.println("Please refer to the table below to check the category for this value:");
    }

}
