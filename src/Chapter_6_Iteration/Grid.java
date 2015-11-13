package Chapter_6_Iteration;

import java.awt.Graphics2D;

/**
 * Solution to exercise P6.15
 *
 * @author ChrisBerryman
 */
public class Grid {
    
    public void draw(Graphics2D g2) {
        int xLeft;
        int yTop;
        int toY = 200;
        int toX = 200;
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 20; j++) {
                xLeft = j * 20;
                yTop = i * 20;
                g2.drawLine(xLeft, yTop, xLeft, toY);
                g2.drawLine(xLeft, yTop, toX, yTop);
            }
        }
    }
    
}
