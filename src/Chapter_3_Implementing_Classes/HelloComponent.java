package Chapter_3_Implementing_Classes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Solution to exercise P3.20.
 *
 * @author ChrisBerryman
 */
public class HelloComponent extends JComponent{
    
    /**
     * paints the component.
     * 
     * @param g the graphics instance.
     */
    @Override
    public void paintComponent(Graphics g) {        
        Graphics2D g2 = (Graphics2D) g;        
        LetterH h = new LetterH(50, 50);
        h.draw(g2);        
    }
    
}
