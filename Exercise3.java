import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();

        int ans = sumOfDigits(num);

        System.out.println("The sum of all digits is " + ans);

        s.close();

    }

    public static int sumOfDigits(int num) {

        int sum = 0;

        while (num > 0) {

            int rem = num % 10;
            sum += rem;
            num /= 10;

        }
        return sum;

    }

}
