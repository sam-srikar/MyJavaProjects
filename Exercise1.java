import java.util.Scanner;

public class Exercise1 {
    public static void main (String[]args){
        Scanner s = new Scanner (System.in);

        System.out.println("Yo, give me two numbers");
        int x = s.nextInt();
        int y = s.nextInt();

        int a = (x + y);
        int sub = (x - y);
        int m = (x * y);
        int d = (x / y);

        System.out.println(x + " + " + y + " = " + a);
        System.out.println(x + " - " + y + " = " + sub);
        System.out.println(x + " * " + y + " = " + m);
        System.out.println(x + " / " + y + " = " + d);



    }
}
