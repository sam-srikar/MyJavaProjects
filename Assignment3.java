/*
 * A java program that takes in values from the user (repeatedly) 
 * and indicates wether it is a prime number or not. It also outputs the maximum number, the minimum number, 
 * the total count of numbers and the average.
 * 
 * By Samhitha Srikar
 * 
 * 4/22/2024
 * 
 * */

import java.util.Scanner;

public class Assignment3 {
    /*
     * Main method that asks the user for input and calls the method that provides
     * output
     */

    public static void main(String[] args) {
        // Initializing sum, count, min and max
        int sum = 0;
        int count = 0;
        int min = -1;
        int max = 0;

        Scanner s = new Scanner(System.in);
        // Checking conditions to run isPrime
        while (true) {
            // Asks for user input
            System.out.println("Enter a positive integer. Enter -1 to quit.");
            int num = s.nextInt();
            // Creating instance to end the loop once -1 is used as an input
            if (num == -1) {
                break;
            }

            // Running isPrime after condition is met
            if (num < 0) {
                continue;
            } else if (num > 0) {
                isPrime(num);
            }

            count++; // Increments count
            sum = sum + num; // Adds to sum

            // calculates max and min respectively
            if (num > max) {
                max = num;
            }
            if (num < min || min == -1) {
                min = num;
            }

        }

        // Print statements that print out the final values (max, min, sum, count)
        System.out.println("The maximum positive number is: " + max);
        System.out.println("The minimum positive number is: " + min);
        System.out.println("The sum is: " + sum);
        System.out.println("The count of number(s) is: " + count);
        average(sum, count);
        s.close();

    }

    // A method that calculates wether a number is prime or not
    public static void isPrime(int number) {

        // Condition to make sure that 0 and 1 are not considered as prime or not
        if (number == 0 || number == 1) {
            System.out.println("The number " + number + " is not a prime number.");
            return;
        }
        // Loop that iterates from 2 to n/2 to check wether the value is prime or not
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("The number " + number + " is not a prime number.");
                return;
            }
        }

        System.out.println("The number " + number + " is a prime number");

    }

    // A method that calculates the average of all inputted values

    public static void average(int sum, int count) {

        double avg = (double) sum / (double) count; // Typecasting from int to double

        System.out.printf("The average is: %.1f\n", avg);

    }

}
