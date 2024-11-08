package Shapes;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

/**
 * CircleShape class that extends the Shape class.
 * This class represents a circle shape.
 */
public class CircleShape extends Shape {
    private int radius;

    public int getRadius(){
        return this.radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    /**
     * Constructor for CircleShape that takes x, y, and radius.
     * 
     * @param x      The x-coordinate of the circle.
     * @param y      The y-coordinate of the circle.
     * @param radius The radius of the circle.
     */
    public CircleShape(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    /**
     * Static method to create a random CircleShape.
     * 
     * @return A CircleShape object with a random radius.
     */
    public static CircleShape getRandomCircleShape() {
        Random random = new Random();
        int x = random.nextInt(400);
        int y = random.nextInt(400);
        int radius = random.nextInt(100) + 20;
        return new CircleShape(x, y, radius);
    }

    /**
     * Method to calculate and return the area of the circle.
     * 
     * @return The area of the circle.
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Method to draw the circle on the screen.
     * 
     * @param g The Graphics object used to draw.
     */
    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawOval(getX(), getY(), radius * 2, radius * 2);
        g.fillOval(getX(), getY(), radius * 2, radius * 2);
    }

    /**
     * Method to get the bounding rectangle of the circle.
     * 
     * @return The bounding rectangle of this shape.
     */
    @Override
    public Rectangle getBoundingRect() {
        return new Rectangle(getX(), getY(), radius * 2, radius * 2);
    }
}
