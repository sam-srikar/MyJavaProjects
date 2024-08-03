import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Exercise4 {
    public static void main(String[] args) {
        function("Ethan", "Happy");

    }

    public static void function(String a, String b) {
        try {
            FileOutputStream fos = new FileOutputStream("e4.txt");
            PrintWriter writer = new PrintWriter(fos);
            if (a.length() == b.length()) {
                writer.println(a + " and " + b + " have the same length");
            } else if (a.length() != b.length()) {
                writer.println(a + " and " + b + " do not have the same length");

            }
            if (a.equals(b)) {
                writer.println("The two strings are the same");
            } else if (!a.equals(b)) {
                writer.println("The two strings are different");

            }
            writer.println(a.charAt(0) + " " + b.charAt(0));
            writer.println(a.toUpperCase() + " " +  b.toUpperCase());
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

    }

}
