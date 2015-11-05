package Chapter_3_Implementing_Classes;

import javax.swing.JFrame;
/**
 * Solution to exercise P3.21
 *
 * @author ChrisBerryman
 */
public class OlympicRingViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Olympic Rings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        OlympicRingComponent component = new OlympicRingComponent();
        frame.add(component);
        frame.setVisible(true);
    }

}
