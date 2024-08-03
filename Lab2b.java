import java.util.Scanner;

public class Lab2b {

    public static void main(String[] args) {

        double maxNumber1 = Math.max(22.3, 34.5); 
        double minNumber1 = Math.min(3.6 / 7.2, 3.8 / 6.9); 
        double maxNumber2 = Math.max(2 / 3, 0.1); 
        double minNumber2 = Math.min(13.5555, 13.5556); 

        System.out.println("Max number 1-" + maxNumber1); //expect 34.5
        System.out.println("Min number 1-" + minNumber1); //expect 0.5
        System.out.println("Max number 2-" + maxNumber2); //expect 0.1
        System.out.println("Min number 2-" + minNumber2); //expect 13.555

        Scanner s = new Scanner(System.in);

        // Get user input
        System.out.println("Please enter your name followed by three numbers (space separated):");
        String name = s.next();
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        double num3 = s.nextDouble();

        // Sorting using Math.max and Math.min
        double maxNum = Math.max(Math.max(num1, num2), num3);
        double minNum = Math.min(Math.min(num1, num2), num3);
        double middleNum = num1 + num2 + num3 - maxNum - minNum;

        // Display the sorted numbers and greet the user
        System.out.println("Hi there, " + name + "! Here are the numbers you entered in descending order:");
        System.out.println(maxNum + " " + middleNum + " and " + minNum);
        System.out.println("Thank you for using the three-number-sorting system! Good-bye.");

        s.close();
    }
}
