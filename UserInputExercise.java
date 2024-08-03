import java.util.Scanner;
/**
 * Write a description of class UserInputExercise here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInputExercise

{
    // instance variables - replace the example below with your own
    private int x;
    

    /**
     * Constructor for objects of class UserInputExercise
     */
    public UserInputExercise()
    {
        // problem 1
        int x = 4;
        int y = 8;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        
        //problem 2
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        int z = s.nextInt();
        System.out.println(w+z);
        System.out.println(w-z);
        System.out.println(w*z);
        
        //problem 3
        String a = "cHaI";
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        
        //problem 4
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age.");
        int age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter your name.");
        String name = keyboard.nextLine();  
        
        //problem 5
        String[] nameSplit= name.split(",");  
        System.out.println(nameSplit[0]);
        System.out.println("you are " + age + " years old.");
        
        //problem 6
        String word1 = keyboard.next();
        String word2 = keyboard.next();
        System.out.println(word1 +" test " + word2);

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
