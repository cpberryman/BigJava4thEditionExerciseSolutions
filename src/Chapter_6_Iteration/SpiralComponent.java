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

    private Spiral spiral = new Spiral(200, 200, 20);

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        spiral.drawNextLine();
         System.out.println("help");
    }

}
