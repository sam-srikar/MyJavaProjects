import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        int l = Integer.MIN_VALUE;
        int m = Integer.MIN_VALUE;
        int sm = Integer.MIN_VALUE;
        Scanner s = new Scanner(System.in);
        System.out.println("How many elements are in the array?");
        int n = s.nextInt();
        int[] userArr = new int[n];
        for (n = 0; n < userArr.length; n++) {
            System.out.println("Please enter the next value: ");
            userArr[n] = s.nextInt();
            if (userArr[n] > l) {
                l = userArr[n];
            } else if (userArr[n] > m) {
                m = userArr[n];
            } else if (userArr[n] > sm) {
                sm = userArr[n];
            }
            System.out.println("The three largest numbers in the array are " + l + ", " + m + " and " + sm);
        }
        for (int val = 0; val < userArr.length; val++) {
            System.out.print(val + " ");

        }
        s.close();

    }

}
