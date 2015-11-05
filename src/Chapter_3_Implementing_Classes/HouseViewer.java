package Chapter_3_Implementing_Classes;

import javax.swing.JFrame;

/**
 * Solution to exercise P3.16
 *
 * @author ChrisBerryman
 */
public class HouseViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("House Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HouseComponent h = new HouseComponent();
        frame.add(h);
        frame.setVisible(true);
    }

}
