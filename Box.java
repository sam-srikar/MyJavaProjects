public class Box {
    
    private double length;
    private double width;
    private double height;

    
    private static int numberBoxes = 0;

    
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        numberBoxes++; 
    }

    
    public double volume() {
        return length * width * height;
    }

   
    public double surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    
    public static int getNumberBoxes() {
        return numberBoxes;
    }

    
    public static void main(String[] args) {
        Box box1 = new Box(2.0, 3.0, 4.0);
        Box box2 = new Box(1.0, 1.5, 2.0);

        System.out.println("Box 1 Volume: " + box1.volume());
        System.out.println("Box 1 Surface Area: " + box1.surfaceArea());
        System.out.println("Box 2 Volume: " + box2.volume());
        System.out.println("Box 2 Surface Area: " + box2.surfaceArea());
        System.out.println("Number of boxes created: " + Box.getNumberBoxes());
    }

    public int computeDifference(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must have at least one element.");
        }
    
        int max = array[0];
        int min = array[0];
    
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
    
        return max - min;
    }
    
}

/*Inheritance is the mechanism 
by which one class (subclass) 
inherits fields and methods from another class (superclass),
allowing 
code reuse and the creation of hierarchical relationships.*/

