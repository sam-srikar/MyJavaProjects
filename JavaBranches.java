    import java.util.Scanner;
    
    public class JavaBranches {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Problem 1: testScore
            System.out.print("Enter test score: ");
            int score = scanner.nextInt();
            testScore(score);
    
            // Problem 2: nested
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            nested(age);
    
            // Problem 3: verifyInput
            System.out.print("Enter an integer: ");
            int input = scanner.nextInt();
            verifyInput(input);
    
            // Problem 4: methodAnd and methodOr
            boolean resultAnd = methodAnd(true, false);
            boolean resultOr = methodOr(true, false);
    
            System.out.println("AND result: " + resultAnd);
            System.out.println("OR result: " + resultOr);
    
            // Close the scanner to avoid resource leak
            scanner.close();
        }
    
        // Problem 1: testScore
        public static void testScore(int score) {
            if (score < 60) {
                System.out.println("Score Message: Less than 60! Need more work");
            } else if (score >= 60 && score <= 69) {
                System.out.println("Score Message: Between 60 and 69 inclusive. You are on the right track");
            } else if (score >= 70 && score <= 79) {
                System.out.println("Score Message: Between 70 and 79 inclusive. Very good");
            } else if (score >= 80 && score <= 89) {
                System.out.println("Score Message: Between 80 and 89 inclusive. Excellent");
            } else if (score >= 90) {
                System.out.println("Score Message: Greater than or equal to 90! Perfect");
            } else {
                System.out.println("Invalid input. Please enter a score between 0 and 100 inclusive.");
            }
        }
    
        // Problem 2: nested
        public static void nested(int age) {
            if (age < 13) {
                System.out.println("You are still a child");
            } else if (age > 12 && age < 20) {
                System.out.println("You are now a teenager");
            } else {
                if (age < 65) {
                    System.out.println("You are an adult");
                } else {
                    System.out.println("You are a senior citizen");
                }
            }
        }
    
        // Problem 3: verifyInput
        public static void verifyInput(int input) {
            switch (input) {
                case 1: case -1:
                    System.out.println("One");
                    break;
                case 2: case -2:
                    System.out.println("Two");
                    break;
                // Add cases for 3 to 9 and their negatives
                case 3: case -3:
                    System.out.println("Three");
                    break;
                // Repeat for 4 to 9
                case 4: case -4:
                    System.out.println("Three");
                    break;
                case 5: case -5:
                    System.out.println("Three");
                    break;
                case 6: case -6:
                    System.out.println("Three");
                    break;
                case 7: case -7:
                    System.out.println("Three");
                    break;
                case 8: case -8:
                    System.out.println("Three");
                    break;
                case 9: case -9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Other");
            }
        }
    
        // Problem 4: methodAnd
        public static boolean methodAnd(boolean x, boolean y) {
            return x & y;
        }
    
        // Problem 4: methodOr
        public static boolean methodOr(boolean x, boolean y) {
            return x | y;
        }
    
        
    }

