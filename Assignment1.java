/*
 * A java program that calculates the javelin throws made by participants in different unit measurements.
 * 
 * By Samhitha Srikar
 * 
 * 3/29/2024
 * 
 * */

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the competitor's name: ");
        String name = s.nextLine();
        System.out.println();
        System.out.println("                Olympic Javelin Throws");
        System.out.println();
        System.out.println("        Enter the distances, in meters, for " + name);
        System.out.println();
        System.out.print("Please enter the distance for throw 1:");
        double m1 = s.nextDouble();
        System.out.println();
        System.out.print("Please enter the distance for throw 2:");
        double m2 = s.nextDouble();
        System.out.println();
        System.out.print("Please enter the distance for throw 3:");
        double m3 = s.nextDouble();
        System.out.println();

        double yards1 = convToYards(m1);
        double yards2 = convToYards(m2);
        double yards3 = convToYards(m3);

        double feet1 = convToFt(yards1);
        double feet2 = convToFt(yards2);
        double feet3 = convToFt(yards3);

        double inches1 = convToIn(feet1);
        double inches2 = convToIn(feet2);
        double inches3 = convToIn(feet3);

        double cm1 = convToCm(m1);
        double cm2 = convToCm(m2);
        double cm3 = convToCm(m3);

        System.out.println("Yards     Feet      Inches    Cm");

        System.out.printf("%-10.2f", yards1);
        System.out.printf("%-10.2f", feet1);
        System.out.printf("%-10.2f", inches1);
        System.out.printf("%-10.2f%n", cm1);

        System.out.printf("%-10.2f", yards2);
        System.out.printf("%-10.2f", feet2);
        System.out.printf("%-10.2f", inches2);
        System.out.printf("%-10.2f%n", cm2);

        System.out.printf("%-10.2f", yards3);
        System.out.printf("%-10.2f", feet3);
        System.out.printf("%-10.2f", inches3);
        System.out.printf("%-10.2f%n", cm3);

        s.close();

    }

    // method that calulates value in yards
    public static double convToYards(double x) {

        return x * 1.093;

    }

    // method that calculates value in feet
    public static double convToFt(double x) {

        return x * 3;

    }

    // method that calculates value in inches
    public static double convToIn(double x) {

        return x * 12;

    }

    // method that calculates value in centimeters
    public static double convToCm(double x) {

        return x * 100;

    }

}
