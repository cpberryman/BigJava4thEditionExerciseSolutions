package Chapter_3_Implementing_Classes;


import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Solution to exercise P3.18 and P3.19
 *
 * A Car2 shape that can be positioned anywhere on the screen.
 *
 * @author ChrisBerryman
 */
public class Car2 {

    private final int xLeft;
    private final int yTop;
    private final int size;

    /**
     * Constructs a Car2 with a given top left corner.
     *
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     * @param size the length of the Car2
     */
    public Car2(int x, int y, int size) {
        xLeft = x;
        yTop = y;
        this.size = size;
    }

    /**
     * Draws the Car2.
     *
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {

        Rectangle body = new Rectangle(xLeft, yTop + size / 6, size, size / 6);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + size / 6, yTop + size / 6 * 2, size / 6, size / 6);
        Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + size / 6 * 4, yTop + size / 6 * 2, size / 6, size / 6);

        // The bottom of the front windshield
        Point2D.Double r1 = new Point2D.Double(xLeft + size / 6, yTop + size / 6);
        // The front of the roof
        Point2D.Double r2 = new Point2D.Double(xLeft + size / 6 * 2, yTop);
        // The rear of the roof
        Point2D.Double r3 = new Point2D.Double(xLeft + size / 6 * 4, yTop);
        // The bottom of the rear windshield
        Point2D.Double r4 = new Point2D.Double(xLeft + size / 6 * 5, yTop + size / 6);

        Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
        Line2D.Double roofTop = new Line2D.Double(r2, r3);
        Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        g2.draw(frontWindshield);
        g2.draw(roofTop);
        g2.draw(rearWindshield);
    }
}
