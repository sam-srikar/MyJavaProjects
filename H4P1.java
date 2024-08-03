/**
 * A program that contains a limit of values that get iterated until each given variable is assigned to a corresponding value.
 * 
 * by Samhitha Srikar
 * 
 * 2/6/24
 */

public class H4P1 {
    public static void main(String[] args) {
        cryptArithmetic();
    }

    public static void cryptArithmetic() {
        for (int T = 1; T <= 9; T++) {
            for (int O = 0; O <= 9; O++) {
                for (int G = 1; G <= 9; G++) {
                    for (int D = 0; D <= 9; D++) {
                        if (isValid(T, O, G, D)) {
                            int TOO = T * 100 + O * 10 + O;
                            int GOOD = G * 1000 + O * 100 + O * 10 + D;

                            if (4 * TOO == GOOD) {
                                System.out.println("Solution found:");
                                System.out.println("  T = " + T);
                                System.out.println("  O = " + O);
                                System.out.println("  G = " + G);
                                System.out.println("  D = " + D);
                                System.out.println("TOO = " + TOO);
                                System.out.println("GOOD = " + GOOD);
                                System.out.println("Equation: 4 * " + TOO + " = " + GOOD);
                                System.out.println();
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean isValid(int t, int o, int g, int d) {
        return t != o && t != g && t != d && o != g && o != d && g != d;
    }
}

