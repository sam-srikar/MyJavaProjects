/**
 *  A program that implements a two-player Pig game, where one player is a human and the other is the computer.
 * 
 * by Samhitha Srikar
 * 
 * 2/7/24
 */

import java.util.Scanner;

public class H4P2 {
    public static void main(String[] args) {
        playPigGame();
    }
    // method that takes in and displays various occurences as the dice rolling varies every turn
    public static void playPigGame() {
        int hum = 0;
        int comp = 0;

        Scanner s = new Scanner(System.in);

        while (hum < 100 && comp < 100) {
            System.out.println("Human's score: " + hum);
            System.out.println("Computer's score: " + comp);

            int humts = humTurn(s);
            hum += humts;

            if (hum >= 100) {
                System.out.println("Human wins!");
                break;
            }

            int compts = compTurn();
            comp += compts;

            if (comp >= 100) {
                System.out.println("Computer wins!");
                break;
            }
        }
    }
        // method that allows a human player to roll the dice repeatedly until it lands at 1
    public static int humTurn(Scanner s) {
                int score = 0;
                String choice;
    
                do {
                System.out.println("Roll again (r) or Hold (h)?");
                choice = s.next();
    
                 if (!choice.equalsIgnoreCase("r") && !choice.equalsIgnoreCase("h")) {
                System.out.println("Invalid choice. Please enter 'r' to roll again or 'h' to hold.");
                continue;
                }
    
                int roll = rollDie();
                System.out.println("You rolled: " + roll);
    
                if (roll == 1 && choice.equalsIgnoreCase("r")) {
                System.out.println("You rolled a 1. Turn ends. Points reset.");
                score = 0;  // reset points gained in this turn
                break;
                }
    
                score += roll;
            } while (choice.equalsIgnoreCase("r"));
    
        return score;
    }

    // helper method that allows the computer to roll a dice with its parameter
    public static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }
    // method that allows the computer to take a turn until it rolls a 1
    public static int compTurn() {
        int score = 0;

        while (score < 20) {
            int roll = rollDie();
            System.out.println("Computer rolled: " + roll);
            if (roll == 1 ) {
                System.out.println("Computer rolled a 1. Turn ends. Points reset.");
                score = 0;  // reset points gained in computers turn
                break;
            } else if(roll != 1){
                continue;
            }
            score += roll;
        }

        return score;
    }
}
