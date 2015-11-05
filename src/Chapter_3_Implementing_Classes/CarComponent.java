package Chapter_3_Implementing_Classes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Solution to exercise P3.18 and P3.19
 *
 * @author ChrisBerryman
 */
public class CarComponent extends JComponent {

    /**
     * Draws two car shapes.
     *
     * @param g the graphics instance.
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Car2 car1 = new Car2(0, 0, 120);
        int x = getWidth() - 120;
        int y = getHeight() - 60;
        Car2 car2 = new Car2(x, y, 120);
        car1.draw(g2);
        car2.draw(g2);
    }

}
