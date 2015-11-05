package Chapter_3_Implementing_Classes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * Solution to exercise P3.7
 *
 * A bull's eye shape that can be positioned anywhere on the screen.
 *
 * @author ChrisBerryman
 */
public class BullsEye {

    private int xLeft;
    private int yTop;

    /**
     * Constructs a bull's eye with a given top left corner.
     *
     * @param x the x coordinate of the top left corner
     * @param y the y coordinate of the top left corner
     */
    public BullsEye(int x, int y) {
        xLeft = x;
        yTop = y;
    }

    public void draw(Graphics2D g2) {
        
        Ellipse2D.Double blackEllipse1 = new Ellipse2D.Double(xLeft, yTop, 100, 100);
        Ellipse2D.Double whiteEllipse1 = new Ellipse2D.Double(xLeft + 10, yTop + 10, 80, 80);
        Ellipse2D.Double blackEllipse2 = new Ellipse2D.Double(xLeft + 20, yTop + 20, 60, 60);
        Ellipse2D.Double whiteEllipse2 = new Ellipse2D.Double(xLeft + 30, yTop + 30, 40, 40);
        Ellipse2D.Double blackEllipse3 = new Ellipse2D.Double(xLeft + 40, yTop + 40, 20, 20);

        g2.setColor(Color.BLACK);
        g2.draw(blackEllipse1);
        g2.fill(blackEllipse1);

        g2.setColor(Color.WHITE);
        g2.draw(whiteEllipse1);
        g2.fill(whiteEllipse1);

        g2.setColor(Color.BLACK);
        g2.draw(blackEllipse2);
        g2.fill(blackEllipse2);

        g2.setColor(Color.WHITE);
        g2.draw(whiteEllipse2);
        g2.fill(whiteEllipse2);

        g2.setColor(Color.BLACK);
        g2.draw(blackEllipse3);
        g2.fill(blackEllipse3);

    }

}
