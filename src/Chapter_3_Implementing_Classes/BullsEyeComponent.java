package Chapter_3_Implementing_Classes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * Solution to exercise P3.15
 *
 * @author ChrisBerryman
 */
public class BullsEyeComponent extends JComponent {

     @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        BullsEye eye = new BullsEye(100, 100);
        eye.draw(g2);
    }
}
