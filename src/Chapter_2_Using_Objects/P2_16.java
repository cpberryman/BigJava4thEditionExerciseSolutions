package Chapter_2_Using_Objects;

import javax.swing.JFrame;

/**
 * TwoSquareViewer for exercise P2.16
 *
 * @author ChrisBerryman
 */
public class P2_16 {
    
    /**
     * Initialises and displays the JFrame.
     */
    public void createAndShowGUI() {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Two Square Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TwoSquareComponent component = new TwoSquareComponent();
        frame.add(component);
        frame.setVisible(true);
    }
    
}
