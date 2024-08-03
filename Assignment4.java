import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * A java program that calculates the weighted average, the class average and wether it is 
 * considered passing or failing after reading the elements from a given file. 
 * 
 * By Samhitha Srikar
 * 
 * 5/8/2024
 * 
 * */

public class Assignment4 {
    // Declaring class level constants
    private static double PROG_WEIGHT;
    private static double MID_WEIGHT;
    private static double FINAL_WEIGHT;

    public static void main(String[] args) {
        // Try-catch to check and read elements from file "courseData.txt" and catches all exceptions
        try {
            FileInputStream fis = new FileInputStream("courseData.txt");
            Scanner reader = new Scanner(fis);
            // Initializing the class level constants (reads from file)
            PROG_WEIGHT = reader.nextDouble();
            MID_WEIGHT = reader.nextDouble();
            FINAL_WEIGHT = reader.nextDouble();

            reader.nextLine();

            while (reader.hasNextLine()) {
                int courseNumber = reader.nextInt();
                System.out.println("Grade Data For Class " + courseNumber);
                System.out.println();
                processClass(reader);

            }
            reader.close();

        } catch (FileNotFoundException e) {

        } catch (NoSuchElementException e){

        }

    }

    // Method to print the titles based on the given format
    public static void processClass(Scanner reader) {
        
        int stuCt = 0;
        int classPrgTotal = 0;

        System.out.println("ID  Programs  Midterm  Final  Weighted Average  Programs grade");
        System.out.println("--  --------  -------  -----  ----------------  --------------");
        while (reader.hasNextLine()) {
            int stuID = reader.nextInt();
            if (stuID == 0)
                break;
            int programScore = reader.nextInt();
            int midtermScore = reader.nextInt();
            int finalScore = reader.nextInt();

            double weightedAvg = calAvgWeight(programScore, midtermScore, finalScore);
            String pOrF = determinePorF(programScore);

            System.out.printf("%4d%5d%10d%8d%13.2f%17s%n", stuID, programScore, midtermScore, finalScore, weightedAvg, pOrF);

            stuCt++;
            classPrgTotal += weightedAvg;

        }
        double classAverage;
        if (stuCt > 0) {
            classAverage = classPrgTotal / stuCt;
        } else {
            classAverage = 0;
        }
        System.out.println();
        System.out.printf("Class Average: %.2f%n", classAverage);
        System.out.println();
    } 
    

    // Method to calculate the average weight of each exam
    public static double calAvgWeight(int programScore, int midtermScore, int finalScore) {
        return (double) ((PROG_WEIGHT * programScore + MID_WEIGHT * midtermScore + FINAL_WEIGHT * finalScore)
                / (PROG_WEIGHT + MID_WEIGHT + FINAL_WEIGHT));
    }

    // Method to determine wether the results are pass or fail
    public static String determinePorF(double programScore) {
        if (programScore >= 70) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
