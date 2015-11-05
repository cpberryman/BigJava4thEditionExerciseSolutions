package Chapter_3_Implementing_Classes;

import javax.swing.JFrame;

/**
 * Solution to exercise P3.20.
 *
 * @author ChrisBerryman
 */
public class HelloViewer {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        JFrame frame = new JFrame();
        frame.setSize(500, 300);
        frame.setTitle("Hello drawn with graphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HelloComponent component = new HelloComponent();
        frame.add(component);
        frame.setVisible(true);
    }

}
