import java.util.Scanner;
public class Exercise2 {

    public static void main (String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper: ");
        String p1 = s.nextLine().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper: ");
        String p2 = s.nextLine().toLowerCase();

        if(p1.equals ("rock") && p2.equals("rock") || p1.equals("paper") && p2.equals("paper") || p1.equals("scissors") && p2.equals("scissors")){
            System.out.println("It is a tie.");
        } else if(p1.equals("paper") && p2.equals("rock") || p1.equals ("rock") && p2.equals("scissors") || p1.equals("scissors") && p2.equals("paper")){
            System.out.println("Player 1 wins.");
        } else if (p1.equals ("rock") && p2.equals("paper") || p1.equals("scissors") && p2.equals("rock") || p1.equals("paper") && p2.equals("scissors")){
            System.out.println("Player 2 wins.");
        } else {
            System.out.println("Wrong choice.");
        }
        

        s.close();


    }

}
