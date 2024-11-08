package Shapes;


import java.util.Random;

/**
 * SquareShape class that extends the RectangleShape class.
 * This class represents a square shape.
 */
public class SquareShape extends RectangleShape {
    

    /**
     * Constructor for SquareShape that takes x, y, and side length.
     * 
     * @param x    The x-coordinate of the square.
     * @param y    The y-coordinate of the square.
     * @param side The side length of the square.
     */
    public SquareShape(int x, int y, int side) {
        super(x, y, side, side);
    }

    /**
     * Static method to create a random SquareShape.
     * 
     * @return A SquareShape object with a random side length.
     */
    public static SquareShape getRandomSquareShape() {
        Random random = new Random();
        int x = random.nextInt(400);
        int y = random.nextInt(400);
        int side = random.nextInt(100) + 20;
        return new SquareShape(x, y, side);
    }
}
