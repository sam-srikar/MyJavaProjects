import java.util.Scanner;
public class prime {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a positive integer. Enter -1 to quit.");
        int num = s.nextInt();

        s.close();
        
        
    }

    public static void isPrime(int num){
        if(num == 0 || num == 1){
            System.out.println("The number " + num + " is not a prime number.");
        } else{
            for(int i = 2; i <= num/2; i++){
                if(num % 1 == 0){
                    System.out.println("The number " + num + " is not a prime number");
                }
            }
        } System.out.println("The number " + num + " is a prime number");
    }

}
