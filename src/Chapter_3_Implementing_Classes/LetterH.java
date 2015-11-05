package Chapter_3_Implementing_Classes;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

/**
 * Solution to exercise P3.20.
 *
 * @author ChrisBerryman
 */
public class LetterH {

    private final int xLeft;
    private final int yTop;

    /**
     * Constructs a LetterH with a given top left corner.
     *
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     */
    public LetterH(int x, int y) {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the letter H
     *
     * @param g2 the graphics instance.
     */
    public void draw(Graphics2D g2) {
        
        Point2D.Double p1 = new Point2D.Double(xLeft, yTop);
        Point2D.Double p2 = new Point2D.Double(xLeft, yTop + 150);
        Line2D.Double leftLine = new Line2D.Double(p1, p2);
        
        Point2D.Double p3 = new Point2D.Double(xLeft + 50, yTop);
        Point2D.Double p4 = new Point2D.Double(xLeft + 50, yTop + 150);
        Line2D.Double rightLine = new Line2D.Double(p3, p4);
        
        Point2D.Double p5 = new Point2D.Double(xLeft, yTop + 75);
        Point2D.Double p6 = new Point2D.Double(xLeft + 50, yTop + 75);
        Line2D.Double horizontalLine = new Line2D.Double(p5, p6);
        
        g2.draw(leftLine);
        g2.draw(rightLine);
        g2.draw(horizontalLine);

    }

}
