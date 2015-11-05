package Chapter_2_Using_Objects;

import java.awt.Color;
import javax.swing.JFrame;

/**
 * DarkerDemo for exercise P2.9
 *
 * @author ChrisBerryman
 */
public class P2_9 {

    /**
     * Prints the colour red, green and blue values of the colour displayed in
     * the frame after calling the Color#darker method.
     */
    public void displayDarkerColour() {        
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color myColor = Color.RED;
        Color c2 = myColor.darker();
        frame.getContentPane().setBackground(c2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);        
    }

}
