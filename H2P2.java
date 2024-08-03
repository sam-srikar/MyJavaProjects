/**
 * A program to calculate and display how much the We-Say-So Corporation pays their employees.
 * 
 * by Samhitha Srikar
 * 
 * 1/25/24
 */
import java.util.Scanner;
public class H2P2 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    s.useDelimiter(",\\s");
    
    //input from the user
    System.out.print("Enter the full name, base pay, and hours worked of selected employee (separated by commas and in order:) ");
    String input = s.nextLine();
    
    //splitting inputs
    int comma1 = input.indexOf(',');
    int comma2 = input.indexOf(',', comma1 + 1);
    
    String name = input.substring(0, comma1).trim();
    
    //takes hours worked and base pay
    int hw = Integer.valueOf(input.substring(comma2 + 1).trim());
    double bp = Double.valueOf(input.substring(comma1 + 1, comma2).trim());
    
    
    //salaryTotal method to calculate total pay
    double tp = salaryTotal(hw, bp);
    
    //returns salaryTotal value
    if (tp == -1) {
    System.out.println("The base salary you entered does not comply with state law.");
    } else if (tp == -2) {
    System.out.println("The number of hours you entered does not comply with company policy.");
    } else {
    System.out.println("The total pay for " + name + " is " + tp + " dollars.");
    }
    
   
    s.close();
 }
    
     /*salaryTotal method that calculates salary based on given info and user's input 
     * 
     (mw- min wage, mhw- max hours worked, lim- work hour limit, otr - overtime rate oth - overtime hours*/
     
    public static double salaryTotal(int hw, double bp) {
    double mw = 5.25;
    int mhw = 60;
    int lim = 40;
    double otr = 1.5;
    double tp;
    int oth = hw - lim;
    
    if (bp < mw) {
    return -1;
    }
    
    if (hw > mhw) {
    return -2;
    }
    
    if (hw > lim) {
    
    tp = (lim * bp) + (oth * otr * bp);
    } else {
    tp = hw * bp;
    }
    
    return tp;
 }
}