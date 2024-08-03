import java.util.Scanner;

/**
 * Lab2a.java
 *
 * @author Samantha Smith,
 * @author (you)
 * @version (a version number or a date)
 */

public class Lab2a {
    public static void main(String[] args) {
        // kelvins and temperaturePrinter tests
        System.out.println("\nTesting kelvins and temperaturePrinter:");
        double f1 = 32.00;
        temperaturePrinter(f1, kelvins(f1));
        temperaturePrinter(35, kelvins(35));
        temperaturePrinter(45, kelvins(45));
        temperaturePrinter(56, kelvins(56));
        temperaturePrinter(77, kelvins(77));
        temperaturePrinter(93, kelvins(93));

        // secondTime tests
        System.out.println("\nTesting secondTime:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input total seconds as an integer");

        int val = sc.nextInt();
        secondTime(val);

        // inSeconds tests
        System.out.println("\nTesting inSeconds:");
        inSeconds(1, 5, 1); // Expect: 3901
        inSeconds(3, 4, 6); // Expect: 11046
        inSeconds(4, 2, 9); // Expect: 14529
        inSeconds(7, 5, 19); // Expect: 25519
        inSeconds(2, 8, 10); // Expect: 7690
        inSeconds(0, 20, 34); // Expect: 1234

        inSeconds(0, 2, 0); // output: 120
        secondTime(9001); // output: 02:30:01
        inSeconds(24, 0, 0); // output: 86400
        secondTime(3600); // output: 01:00:00
        inSeconds(-1, 61, -60); // output: 0

        sc.close();

    }

    /**
     * kelvins
     *
     * This method converts a value in F to the corresponding value in K.
     *
     * @param f double The temperature in Farenheit
     * @return The temeprature in Kelvins
     */
    public static double kelvins(double f) {

        double k = (f - 32) * 5 / 9 + 273.15;
        return k;
    }

    /**
     * temperaturePrinter
     *
     * This method prints the message "<f> F corresponds to <k> K"
     *
     * @param f double The temperature in Farenheit
     * @param k double The temperature in Kelvins
     */
    public static void temperaturePrinter(double f, double k) {
        System.out.println(f + " deg. F equals " + k + " deg. K");
    }

    /**
     * secondTime
     *
     * This method converts from seconds to hour:minutes:seconds, and prints the
     * result to the console.
     *
     * @param inputSeconds int The total seconds to convert
     */
    public static void secondTime(int seconds) {

        int hours = seconds / 3600;
        int min = (seconds % 3600) / 60;
        int s = seconds % 60;

        System.out.printf("%d seconds == %02d:%02d:%02d%n", seconds, hours, min, s);

    }

    /**
     * inSeconds
     *
     * This method converts from hours:munites:seconds to seconds, and prints the
     * result to the console.
     *
     * @param hours int The hours to convert
     * @param mins  int The minutes to convert
     * @param secs  int The seconds to convert
     * @return The total number of seconds
     */
    public static void inSeconds(int hours, int min, int seconds) {

        int s = hours * 3600 + min * 60 + seconds;
        System.out.printf("%02d:%02d:%02d = %d seconds\n", hours, min, seconds, s);

    }

}
