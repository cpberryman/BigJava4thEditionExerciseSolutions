package Chapter_2_Using_Objects;

import java.awt.Color;
import javax.swing.JFrame;

/**
 * BrighterDemo for exercise P2.8
 *
 * @author ChrisBerryman
 */
public class P2_8 {
    
    /**
     * Prints the colour red, green and blue values of the colour displayed in
     * the frame after calling the Color#brighter method.
     */
    public void displayColour() {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color myColor = new Color(50, 100, 150);
        Color c2 = myColor.brighter();
        frame.getContentPane().setBackground(c2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
