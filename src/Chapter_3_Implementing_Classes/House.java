package Chapter_3_Implementing_Classes;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

/**
 * Solution to exercise P3.16
 *
 * A house that can be positioned anywhere on the screen.
 *
 * @author ChrisBerryman*
 */
public class House {


    private final int xLeft;
    private final int yTop;
    private final int size;

    /**
     * Constructs a house with a given top left corner.
     *
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     * @param size the width of the house
     */
    public House(int x, int y, int size) {
        xLeft = x;
        yTop = y;
        this.size = size;

    }

    public void draw(Graphics2D g2) {

        Rectangle facade = new Rectangle(xLeft, yTop + size / 10 * 3, size, size / 10 * 7);
        Rectangle window = new Rectangle(size / 10 + xLeft, size / 5 * 2 + yTop, size / 5, size / 5);
        Rectangle door = new Rectangle(size / 10 + xLeft, size / 10 * 7 + yTop, size / 5, size / 10 * 3);
        Point2D.Double p1 = new Point2D.Double(xLeft, yTop + size / 10 * 3);
        Point2D.Double p2 = new Point2D.Double(xLeft + size / 2, yTop);
        Point2D.Double p3 = new Point2D.Double(xLeft + size * 1, yTop + size / 10 * 3);
        Line2D.Double l1 = new Line2D.Double(p1, p2);
        Line2D.Double l2 = new Line2D.Double(p2, p3);

        g2.draw(facade);
        g2.draw(window);
        window.translate(size / 10 * 3, 0);
        g2.draw(window);
        window.translate(size / 10 * 3, 0);
        g2.draw(window);
        window.translate(0, size / 10 * 3);
        g2.draw(window);
        window.translate(-size / 10 * 3, 0);
        g2.draw(window);
        g2.draw(door);
        g2.draw(l1);
        g2.draw(l2);

    }

}
