/**
 * A program that calculates the compound interest of a user after inputting compound numbers and later develops a final value.
 *
 * by Samhitha Srikar
 * 
 * 2/14/2024
 * 
 */
public class CompoundInterest {

    public static void main(String[] args) {
        double inamt = 100.00; // initial amount
        double intrate = 0.05; // interest rate (5%)

        int[] freq = {1, 4, 365, 1000, 10000}; // input values (example)
        for (int i : freq) {
            double finval = finvalCalc(inamt, intrate, i);
            System.out.println("With compound interest " + i + ", the final value is: $" + finval);
        }
    }
    // method that calculates the final value after taking in the inputs called in main
    public static double finvalCalc(double inamt, double rate, int freq) {
        double finval = inamt;
        for (int i = 0; i < freq; i++) {
            finval *= (1 + rate / freq);
        }
        return finval;
    }
}

/* Results:
 * i = 1; final value = $105.0
 * i = 4; final value = $105.09453369140624
 * i = 365; final value = $105.12674964674483
 * i = 1000; final value = $105.12697823318882
 * i = 10000; final value = $105.12709649679252
 */

