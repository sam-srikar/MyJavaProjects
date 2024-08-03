import java.util.Scanner;
/**
 * The GeniegotchiDemo class is a demonstration of the Geniegotchi game.
 *
 * by Samhitha Srikar
 * 
 * 2/28/24
 * 
 */

public class GeniegotchiDemo {

    public static void printMenu() {
        System.out.println("Welcome to Geniegotchi!");
        System.out.println("Menu:");
        System.out.println("1- Rename your Geniegotchi");
        System.out.println("2- Get current stats on Geniegotchi");
        System.out.println("3- Feed your Geniegotchi");
        System.out.println("4- Play with your Geniegotchi");
        System.out.println("5- Ask your fortune");
        System.out.println("0- Quit");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Geniegotchi genie = new Geniegotchi();

        printMenu();

        int opt;
        do {
            System.out.print("Enter choice: ");
            opt = s.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("Enter a new name: ");
                    String newName = s.next();
                    genie.setName(newName);
                    break;
                case 2:
                    genie.genieInfo();
                    break;
                case 3:
                    genie.feed();
                    break;
                case 4:
                    genie.play();
                    break;
                case 5:
                    genie.askFortune();
                    break;
                case 0:
                    System.out.println("Thank you for playing.");
                    break;
                default:
                    System.out.println("Invalid choice. Choose again.");
            }

            // check if Geniegotchi has run out of happiness or endurance
            if (genie.getHappiness() <= 0 || genie.getEndurance() <= 0) {
                System.out.println("Your Geniegotchi has run away either hungry or unhappy :(");
                opt = 0; // exit the loop
            }

        } while (opt != 0);

        s.close();
    }
}
