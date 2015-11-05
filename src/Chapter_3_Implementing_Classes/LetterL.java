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
     * Draws the letter
     *
     * @param g2 the graphics instance.
     */
    public void draw(Graphics2D g2) {
        
    }
    
}
