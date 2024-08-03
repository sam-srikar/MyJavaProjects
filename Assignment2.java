import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the sales for Store 1:");
        double s1 = s.nextDouble();
        System.out.println("Enter the sales for Store 2:");
        double s2 = s.nextDouble();
        System.out.println("Enter the sales for Store 3:");
        double s3 = s.nextDouble();
        System.out.println("Enter the sales threshold:");
        double th = s.nextDouble();

        if (s1 > th && s2 < th && s3 < th) {
            System.out.println("Store 1 did great!");
            System.out.println("The average sales for exceeding stores: " + s1);

        } else if (s2 > th && s1 < th && s3 < th) {
            System.out.println("Store 2 did great!");
            System.out.println("The average sales for exceeding stores: " + s2);

        } else if (s3 > th && s1 < th && s2 < th) {
            System.out.println("Store 3 did great!");
            System.out.println("The average sales for exceeding stores: " + s3);

        } else if (s1 > th && s2 > th) {
            System.out.println("Store 1 and 2 did great!");
            System.out.println("The average sales for exceeding stores: " + ((s1 + s2) / 2));

        } else if (s1 > th && s3 > th) {
            System.out.println("Store 1 and 3 did great!");
            System.out.printf("The average sales for exceeding stores:" + "%.2f" , ((s1 + s3) / 2));
            

        } else if (s2 > th && s3 > th) {
            System.out.println("Store 2 and 3 did great!");
            System.out.println("The average sales for exceeding stores: " + ((s2 + s3) / 2));

        } else if (s1 < th && s2 < th && s3 < th) {
            System.out.println("No store met the threshold");

        } else if (s1 > th && s2 > th && s3 > th) {
            System.out.println("All stores met the threshold!");
            System.out.println("The average sales for exceeding stores: " + ((s1 + s2 + s3) / 3));
        }

        s.close();

    }

}
