package Chapter_7_Arrays_and_Array_Lists;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * Solution to exercise P7.17
 *
 * @author ChrisBerryman
 */
public class Cloud {

    private ArrayList<Point2D> points = new ArrayList<>();

    /**
     * Adds a point to the cloud.
     *
     * @param aPoint the point to add.
     */
    public void add(Point2D.Double aPoint) {
        points.add(aPoint);
    }

    /**
     * Draws the cloud.
     *
     * @param g2 the graphics context.
     */
    public void draw(Graphics2D g2) {
        for (Point2D p : points) {
            g2.drawOval((int) p.getX(), (int) p.getY(), 5, 5);
        }
    }

}
