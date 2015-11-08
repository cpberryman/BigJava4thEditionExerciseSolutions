package Chapter_5_Decisions;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Solution to exercise P5.20
 *
 * @author ChrisBerryman
 */
public class Circle {

    private double xTop, yLeft, diameter, radius, xCenter, yCenter;
    private Point2D.Double point;
    /**
     * Constructs a Circle object with a given radius
     *
     * @param point the x and y axis of the circle
     * @param radius the radius of the circle
     */
    public Circle(Point2D.Double point, double radius) {

        this.point = point;
        this.xTop = point.x;
        this.yLeft = point.y;
        
        this.radius = radius;
        this.diameter = radius * 2;
        this.xCenter = xTop + radius;
        this.yCenter = yLeft + radius;
        
    }
    
    public double getRadius() {
        
        return radius;
        
    }
    
    /**
     * Draws the Circle object.
     * 
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2, Color c) {

        Ellipse2D.Double circle = new Ellipse2D.Double(xTop, yLeft, diameter, diameter);
        g2.setColor(c);
        g2.fill(circle);
        g2.draw(circle);

    }

    /**
     * Returns a {@code boolean} value based on the intersection of two Circle 
     * objects.
     *
     * @param other the other Circle object to check for an intersection
     * @return true if there is an intersection, false otherwise.
     */
    public boolean intersects(Circle other) {

        double sum = Math.sqrt(((this.xCenter - other.xCenter) * (this.xCenter - other.xCenter)) + ((this.yCenter - other.yCenter) * (this.yCenter - other.yCenter)));
        return Math.abs(this.radius - other.radius) <= sum && sum <= Math.abs(this.radius + other.radius);
             
    }

}
