package Chapter_7_Arrays_and_Array_Lists;

import java.awt.geom.Point2D;
import java.util.Random;
import javax.swing.JFrame;
/**
 * Solution to exercise P7.17
 *
 * @author ChrisBerryman
 */
public class CloudViewer {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Random generator = new Random();        
        JFrame frame = new JFrame("Cloud Viewer");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        Cloud c = new Cloud();
        for (int i = 0; i < 100; i++) {
            c.add(new Point2D.Double(generator.nextInt(500) + 1, generator.nextInt(500) + 1));
        }
        CloudComponent component = new CloudComponent(c);
        frame.add(component);
        frame.setVisible(true);        
    }
    
}
