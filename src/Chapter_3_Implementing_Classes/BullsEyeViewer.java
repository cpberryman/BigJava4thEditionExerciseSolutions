package Chapter_3_Implementing_Classes;

import javax.swing.JFrame;

/**
 * Solution to exercise P3.15
 *
 * @author ChrisBerryman
 */
public class BullsEyeViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 400);
        frame.setTitle("Bulls eye!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BullsEyeComponent component = new BullsEyeComponent();
        frame.add(component);
        frame.setVisible(true);
    }

}
