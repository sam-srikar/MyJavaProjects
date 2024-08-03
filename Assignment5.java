/*
 * A program that calculates and outputs the velocity of a skydiver over time, accounting for air resistance, based on user-provided parameters.
 * 
 * By Samhitha Srikar
 * 
 * 3/11/2024
 * 
 * */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean diveAgain = true;

        while (diveAgain) {
            // Input parameters
            System.out.print("Enter the mass of the skydiver (kg): ");
            double mass = s.nextDouble();

            System.out.print("Enter the cross-sectional area of the skydiver (m^2): ");
            double area = s.nextDouble();

            System.out.print("Enter the drag coefficient of the skydiver: ");
            double dragCoef = s.nextDouble();

            System.out.print("Enter the ending time (sec): ");
            double endTime = s.nextDouble();

            System.out.print("Enter the time step (sec): ");
            double timeStep = s.nextDouble();

            System.out.print("Enter the output filename: ");
            String filename = s.next();

            // Constants
            final double densityOfAir = 1.14; // kg/m^3
            final double gravity = 9.81; // m/s^2

            // Arrays to hold time and velocity values
            int numSteps = (int) (endTime / timeStep) + 1;
            double[] timeArray = new double[numSteps];
            double[] velocityArray = new double[numSteps];

            // Initial conditions
            timeArray[0] = 0;
            velocityArray[0] = 0;

            // Perform calculations
            for (int i = 1; i < numSteps; i++) {
                double t = i * timeStep;
                double v = velocityArray[i - 1];

                double acceleration = gravity - (0.5 * dragCoef * densityOfAir * area * v * v) / mass;
                double newVelocity = v + acceleration * timeStep;

                timeArray[i] = t;
                velocityArray[i] = newVelocity;
            }

            // Write results to CSV file
            try (FileWriter writer = new FileWriter(filename)) {
                for (int i = 1; i < numSteps; i++) {
                    writer.write(timeArray[i] + "," + velocityArray[i] + "\n");
                }
                System.out.println("Writing out file. Here are the first few lines:");
                for (int i = 1; i < Math.min(10, numSteps); i++) {
                    System.out.printf("%.3f, %.4f%n", timeArray[i], velocityArray[i]);
                }
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }

            // Ask user for another dive
            System.out.print("Enter another dive? (y/[n]): ");
            diveAgain = s.next().equalsIgnoreCase("y");
        }

        s.close();
    }
}
