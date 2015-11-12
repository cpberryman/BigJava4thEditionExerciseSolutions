package Chapter_6_Iteration;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Solution to exercise P6.17
 *
 * @author ChrisBerryman
 */
public class P6_17Component extends JComponent {

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        int xLeft = 0;
        int yTop = 0;        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
               xLeft = j * 20;
               yTop = i * 20;
               if (i % 2 == j % 2) {
                   g2.setColor(Color.WHITE);
               } else {
                   g2.setColor(Color.BLACK);
               }
               g2.fillRect(xLeft, yTop, 20, 20);
            }
            yTop += 10;
        }
    }

}
