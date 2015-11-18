package Chapter_6_Iteration;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Solution to exercise P6.19
 *
 * @author ChrisBerryman
 */
public class SpiralComponent extends JComponent {

    /**
     * Paints the spiral component.
     *
     * @param g the graphics context.
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Spiral spiral = new Spiral(200, 200, 30);
        spiral.draw(g2);
    }

}
