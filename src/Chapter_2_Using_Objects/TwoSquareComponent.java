package Chapter_2_Using_Objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 * TwoSquareComponent for exercise P2.16
 *
 * @author ChrisBerryman
 */
public class TwoSquareComponent extends JComponent {
    
    /**
     * Paints the squares on the component.
     *
     * @param g the graphics instance.
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;        
        Rectangle s1 = new Rectangle(50, 50, 100, 100);
        Rectangle s2 = new Rectangle(150, 150, 100, 100);        
        Color c1 = new Color(225, 190, 190);
        g2.setColor(c1);
        g2.fill(s1);
        g2.draw(s1);        
        g2.setColor(Color.magenta);        
        g2.fill(s2);
        g2.draw(s2);
    }
    
}
