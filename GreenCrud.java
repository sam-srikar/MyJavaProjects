import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * A program that calculates the growth rate of a crud population using the theory of Fibonacci numbers (series).
 *
 * by Samhitha Srikar
 * 
 * 2/15/2024
 * 
 */
    
    public class GreenCrud {
        public static void main(String[] args) {
            try {
                Scanner s = new Scanner(new File("greencrud.txt"));
                PrintWriter txt = new PrintWriter("crudout.txt");
    
                while (s.hasNextLine()) {
                    String line = s.nextLine();
                    String[] parts = line.split(" ");
    
                    int insize = strConvert(parts[0]); // initial size
                    int days = strConvert(parts[1]); // number of days in the given period
                    int finsize = popSizeCalc(insize, days); // final size of the crud
    
                    txt.printf("Initial size: %d pounds, Days: %d, Final size: %d pounds\n", insize, days, finsize);
                }
    
                txt.close();
                s.close();
                System.out.println("Check crudout.txt");
            } catch (FileNotFoundException e) {
                System.out.println("FNF");
                e.printStackTrace();
            }
    }
    // method that calculates the population size as it continues to grow
        public static int popSizeCalc(int insize, int days) {
        int fib0 = 1;
        int fib1 = 0;
        int finsize = insize;
        int i = 2;
    
        while (i <= days / 5) {
            int fibfin = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibfin;
            finsize += fibfin * insize;
            i++;
        }
    
        return finsize;
    }
    // method that converts string to int and prints values based on formatting (helper for main)
        public static int strConvert(String valid) {
            int result = 0;
            for (int i = 0; i < valid.length(); i++) {
                char c = valid.charAt(i);
                if (c >= '0' && c <= '9') {
                    result = result * 10 + (c - '0');
                } else {
                    throw new NumberFormatException("Invalid format: " + valid);
                }
            }
            
            return result;
    }
}

