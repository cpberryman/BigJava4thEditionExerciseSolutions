package Chapter_3_Implementing_Classes;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Line2D;

/**
 * Solution to exercise P3.20.
 *
 * @author ChrisBerryman
 */
public class LetterL {
    
    private final int xLeft;
    private final int yTop;
    /**
     * Constructs a LetterL with a given top left corner.
     *
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     */
    public LetterL(int x, int y) {
        xLeft = x;
        yTop = y;        
    }
    
    /**
     * Draws the letter L
     *
     * @param g2 the graphics instance.
     */
    public void draw(Graphics2D g2) {
        
        Point2D.Double p1 = new Point2D.Double(xLeft, yTop);
        Point2D.Double p2 = new Point2D.Double(xLeft, yTop + 150);
        Line2D.Double leftLine = new Line2D.Double(p1, p2);       
        
        Point2D.Double p7 = new Point2D.Double(xLeft, yTop + 150);
        Point2D.Double p8 = new Point2D.Double(xLeft + 50, yTop + 150);
        Line2D.Double horizontalLineBottom = new Line2D.Double(p7, p8);
        
        g2.draw(leftLine);
        g2.draw(horizontalLineBottom);
        
    }
    
}
