import java.util.Scanner;

public class BankTransaction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your balance:");
        int balance = s.nextInt();
        System.out.println("Your initial balance is " + balance);
        String option;

        do {
            System.out.println("Click a) Withdraw $5, b) Deposit $5, c) Display current balance or d) Exit");
            option = s.next();
            
            switch (option) {

                case "a":
                    balance -= 5;
                    System.out.println("Your current balance is: " + balance);
                    break;

                case "b":
                    balance += 5;
                    System.out.println("Your current balance is: " + balance);
                    break;

                case "c":
                    System.out.println("Your current balance is: " + balance);
                    break;

                case "d":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Try a different letter");
                    break;

            }
            
        } while(!option.equals("d"));
        s.close();

        
    }

}
