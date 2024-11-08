package Shapes;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

/**
 * RectangleShape class that extends the Shape class.
 * This class represents a rectangle shape.
 */
public class RectangleShape extends Shape {
    private int width;
    private int height;

    public int getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getWidth(){
        return this.width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    /**
     * Constructor for RectangleShape that takes x, y, width, and height.
     * 
     * @param x      The x-coordinate of the shape.
     * @param y      The y-coordinate of the shape.
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     */
    public RectangleShape(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    /**
     * Static method to create a random RectangleShape.
     * 
     * @return A RectangleShape object with random dimensions.
     */
    public static RectangleShape getRandomRectangleShape() {
        Random random = new Random();
        int x = random.nextInt(400);
        int y = random.nextInt(400);
        int width = random.nextInt(100) + 20;
        int height = random.nextInt(100) + 20;
        return new RectangleShape(x, y, width, height);
    }

    /**
     * Method to calculate and return the area of the rectangle.
     * 
     * @return The area of the rectangle.
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * Method to draw the rectangle on the screen.
     * 
     * @param g The Graphics object used to draw.
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawRect(getX(), getY(), width, height);
        g.fillRect(getX(), getY(), width, height);
    }

    /**
     * Method to get the bounding rectangle of the shape.
     * 
     * @return The bounding rectangle of this shape.
     */
    @Override
    public Rectangle getBoundingRect() {
        return new Rectangle(getX(), getY(), width, height);
    }
}

