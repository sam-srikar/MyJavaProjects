import java.util.Scanner; // imported scanner
/**
 * A program that takes in integer inputs from the user and outputs its average
 *
 * By Samhitha Srikar
 * 
 * 2/15/2024
 * 
 */
    public class Average {
        public static void main(String[] args) {
        double n = 0.0; // changed int to double and 1.0 to 0.0
        Scanner scanner = new Scanner(System.in); // capitalized 's' in "System.in"
        System.out.println("This program calculates the average (mean) of entered numbers."); // got rid of unnecessary '+'
        int x; 
        int sum = 0; // initialized sum to add all x values

        do {
            
            System.out.println("Enter another number (or 0 to stop and show the average):"); // got rid of unnecessary '+'
            x = scanner.nextInt(); // got rid of '+'= and made it '='
            sum += x;
            n++;
            if (x == 0){ // if statement to make sure the final '0' is not added to the n increment
                n--;
            }
        } while (x != 0); 
        double avg = (sum/n); // created variable to store average value
        System.out.println("Your final average is: " + avg); // got rid of %d as formatting is not needed for this double case
    }
}