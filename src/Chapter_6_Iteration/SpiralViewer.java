package Chapter_6_Iteration;

import javax.swing.JFrame;

/**
 * Solution to exercise P6.19
 *
 * @author ChrisBerryman
 */
public class SpiralViewer {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Spiral");
        SpiralComponent component = new SpiralComponent();
        frame.add(component);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 440);
        frame.setResizable(false);
        frame.setVisible(true);
    }
        
    
}
