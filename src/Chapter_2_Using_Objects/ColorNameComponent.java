package Chapter_2_Using_Objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * ColorNameComponent for exercise P2.15
 *
 * @author ChrisBerryman
 */
public class ColorNameComponent extends JComponent {

    /**
     * Paints the names on the component.
     *
     * @param g the graphics instance.
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setColor(Color.black);
        g2.drawString("Black", 20, 20);
        g2.setColor(Color.blue);
        g2.drawString("Blue", 20, 30);
        g2.setColor(Color.cyan);
        g2.drawString("Cyan", 20, 40);
        g2.setColor(Color.gray);
        g2.drawString("Gray", 20, 50);
        g2.setColor(Color.darkGray);
        g2.drawString("DarkGray", 20, 60);
        g2.setColor(Color.lightGray);
        g2.drawString("LightGray", 20, 70);
        g2.setColor(Color.green);
        g2.drawString("Green", 20, 80);
        g2.setColor(Color.magenta);
        g2.drawString("Magenta", 20, 90);
        g2.setColor(Color.orange);
        g2.drawString("Orange", 20, 100);
        g2.setColor(Color.pink);
        g2.drawString("Pink", 20, 110);
        g2.setColor(Color.red);
        g2.drawString("Red", 20, 120);
        g2.setColor(Color.yellow);
        g2.drawString("Yellow", 20, 130);
        
    }

}
