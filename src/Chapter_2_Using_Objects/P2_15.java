package Chapter_2_Using_Objects;

import javax.swing.JFrame;

/**
 * ColorNameViewer for exercise P2.15
 *
 * @author ChrisBerryman
 */
public class P2_15 {

    /**
     * Initialises and displays the JFrame.
     */
    public void createAndShowGUI() {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Colour Name Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorNameComponent component = new ColorNameComponent();
        frame.add(component);
        frame.setVisible(true);
    }

}
