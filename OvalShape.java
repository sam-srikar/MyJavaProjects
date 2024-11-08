package Shapes;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

/**
 * OvalShape class that extends the Shape class.
 * This class represents an oval shape with specified width and height.
 */
public class OvalShape extends Shape {
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
     * Constructor for OvalShape that takes x, y, width, and height.
     * 
     * @param x      The x-coordinate of the oval.
     * @param y      The y-coordinate of the oval.
     * @param width  The width of the oval.
     * @param height The height of the oval.
     */
    public OvalShape(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    /**
     * Static method to create a random OvalShape.
     * 
     * @return An OvalShape object with random width and height.
     */
    public static OvalShape getRandomOvalShape() {
        Random random = new Random();
        int x = random.nextInt(400);
        int y = random.nextInt(400);
        int width = random.nextInt(100) + 20;
        int height = random.nextInt(100) + 20;
        return new OvalShape(x, y, width, height);
    }

    /**
     * Method to calculate and return the area of the oval.
     * 
     * @return The area of the oval (approximation using an ellipse formula).
     */
    @Override
    public double getArea() {
        return Math.PI * (width / 2.0) * (height / 2.0);
    }

    /**
     * Method to draw the oval on the screen.
     * 
     * @param g The Graphics object used to draw.
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawOval(getX(), getY(), width, height);
        g.fillOval(getX(), getY(), width, height);
    }

    /**
     * Method to get the bounding rectangle of the oval.
     * 
     * @return The bounding rectangle of this shape.
     */
    @Override
    public Rectangle getBoundingRect() {
        return new Rectangle(getX(), getY(), width, height);
    }
}
