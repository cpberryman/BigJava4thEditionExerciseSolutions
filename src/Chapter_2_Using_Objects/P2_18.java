package Chapter_2_Using_Objects;

import javax.swing.JFrame;

/**
 * FaceViewer for exercise P2.17
 *
 * @author ChrisBerryman
 */
public class P2_18 {

    /**
     * Initialises and displays the JFrame.
     */
    public void createAndShowGUI() {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Face Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        FaceComponent component = new FaceComponent();
        frame.add(component);
        frame.setVisible(true);
    }

}
