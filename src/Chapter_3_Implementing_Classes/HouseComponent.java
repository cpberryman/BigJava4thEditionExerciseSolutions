package Chapter_3_Implementing_Classes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Solution to exercise P3.16
 *
 * @author ChrisBerryman
 */
 public class HouseComponent extends JComponent {

  /**
   * Draws a house shape.
   *
   * @param g the graphics instance
   */
    @Override
    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        House h = new House(100, 100, 50);
        House h2 = new House(150, 150, 150);
        House h3 = new House(50, 50, 30);
        House h4 = new House(10, 200, 80);

        h.draw(g2);
        h2.draw(g2);
        h3.draw(g2);
        h4.draw(g2);

    }


}
