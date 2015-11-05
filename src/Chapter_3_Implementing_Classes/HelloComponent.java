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
        int startX = 50; //the x coordinate for the first letter
        int startY = 50; //the y coordinate for the first letter        
        LetterH h = new LetterH(startX, startY);
        LetterE e = new LetterE(startX + 70, startY);
        LetterL l = new LetterL(startX + 140, startY);
        LetterL l2 = new LetterL(startX + 210, startY);
        LetterO o = new LetterO(startX + 280, startY);
        h.draw(g2); 
        e.draw(g2);
        l.draw(g2);
        l2.draw(g2);
        o.draw(g2);
    }
    
}
