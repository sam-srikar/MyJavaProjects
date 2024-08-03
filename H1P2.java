/**
 * A program to calculate the conversions and change on various US currencies
 *
 * by Samhitha Srikar
 * 
 * 1/24/24
 */
import java.util.Scanner;

public class H1P2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 5 tests for change method
        System.out.print("Enter total cents: ");
        int totalC1 = s.nextInt();
        change(totalC1);

        System.out.print("Enter total cents: ");
        int totalC2 = s.nextInt();
        change(totalC2);

        System.out.print("Enter total cents: ");
        int totalC3 = s.nextInt();
        change(totalC3);

        System.out.print("Enter total cents: ");
        int totalC4 = s.nextInt();
        change(totalC4);

        System.out.print("Enter total cents: ");
        int totalC5 = s.nextInt();
        change(totalC5);


        // 5 tests for inCents method
        System.out.print("Enter dollars: ");
        int dollars1 = s.nextInt();
        System.out.print("Enter quarters: ");
        int quarters1 = s.nextInt();
        System.out.print("Enter dimes: ");
        int dimes1 = s.nextInt();
        System.out.print("Enter nickels: ");
        int nickels1 = s.nextInt();
        System.out.print("Enter cents: ");
        int cents1 = s.nextInt();
        inCents(dollars1, quarters1, dimes1, nickels1, cents1);

        System.out.print("Enter dollars: ");
        int dollars2 = s.nextInt();
        System.out.print("Enter quarters: ");
        int quarters2 = s.nextInt();
        System.out.print("Enter dimes: ");
        int dimes2 = s.nextInt();
        System.out.print("Enter nickels: ");
        int nickels2 = s.nextInt();
        System.out.print("Enter cents: ");
        int cents2 = s.nextInt();
        inCents(dollars2, quarters2, dimes2, nickels2, cents2);

        System.out.print("Enter dollars: ");
        int dollars3 = s.nextInt();
        System.out.print("Enter quarters: ");
        int quarters3 = s.nextInt();
        System.out.print("Enter dimes: ");
        int dimes3 = s.nextInt();
        System.out.print("Enter nickels: ");
        int nickels3 = s.nextInt();
        System.out.print("Enter cents: ");
        int cents3 = s.nextInt();
        inCents(dollars3, quarters3, dimes3, nickels3, cents3);

        System.out.print("Enter dollars: ");
        int dollars4 = s.nextInt();
        System.out.print("Enter quarters: ");
        int quarters4 = s.nextInt();
        System.out.print("Enter dimes: ");
        int dimes4 = s.nextInt();
        System.out.print("Enter nickels: ");
        int nickels4 = s.nextInt();
        System.out.print("Enter cents: ");
        int cents4 = s.nextInt();
        inCents(dollars4, quarters4, dimes4, nickels4, cents4);

        System.out.print("Enter dollars: ");
        int dollars5 = s.nextInt();
        System.out.print("Enter quarters: ");
        int quarters5 = s.nextInt();
        System.out.print("Enter dimes: ");
        int dimes5 = s.nextInt();
        System.out.print("Enter nickels: ");
        int nickels5 = s.nextInt();
        System.out.print("Enter cents: ");
        int cents5 = s.nextInt();
        inCents(dollars5, quarters5, dimes5, nickels5, cents5);

        s.close();
    }
        // method to calculate and display cents in terms of other values
    public static void change(int totalC) {
        int dollars = totalC / 100; 
        totalC %= 100;

        int quarters = totalC / 25; 
        totalC %= 25;

        int dimes = totalC / 10; 
        totalC %= 10;

        int nickels = totalC / 5; 
        int cents = totalC % 5;

        System.out.println("is:"); 
        // total value in dollars, quarters, dimes, nickels and cents
        System.out.println(dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + cents + " cents.");
    }
        // method to calculate total cents
    public static void inCents(int dollars, int quarters, int dimes, int nickels, int cents) {
        int totalC = dollars * 100 + quarters * 25 + dimes * 10 + nickels * 5 + cents; 

        System.out.println(dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + cents + " cents are:");
        System.out.println(totalC + " cents.");
    }
}

