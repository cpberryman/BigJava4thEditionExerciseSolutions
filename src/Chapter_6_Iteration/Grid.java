package Chapter_6_Iteration;

import java.awt.Graphics2D;

/**
 * Solution to exercise P6.15
 *
 * @author ChrisBerryman
 */
public class Grid {

    /**
     * Draws the grid.
     *
     * @param g2 the graphics context.
     */
    public void draw(Graphics2D g2) {
        int xLeft;
        int yTop;
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 20; j++) {                
                xLeft = j * 20;
                yTop = i * 20;
                System.out.println("xLeft:" + xLeft);
                System.out.println("yTop: " + yTop);
                g2.drawLine(xLeft, yTop, xLeft, 0);
                g2.drawLine(xLeft, yTop, 0, yTop);
            }
        }
    }

}
