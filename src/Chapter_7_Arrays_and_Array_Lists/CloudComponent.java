package Chapter_7_Arrays_and_Array_Lists;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Solution to exercise P7.17
 *
 * @author ChrisBerryman
 */
public class CloudComponent extends JComponent {

    private final Cloud cloud;

    public CloudComponent(Cloud c) {
        cloud = c;
    }

    /**
     * Paints the component.
     *
     * @param g the graphics instance.
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        cloud.draw(g2);
    }

}
