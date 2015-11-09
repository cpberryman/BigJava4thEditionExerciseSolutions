package Chapter_6_Iteration;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * Solution to exercise P6.18
 * This program displays a number of circles, specified by the user, with random
 * locations and diameters.
 *
 * @author ChrisBerryman
 */
public class RandomCirclesTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setTitle("Random Circle Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RandomCirclesComponent component = new RandomCirclesComponent(20);
        frame.add(component);
        frame.setVisible(true);        
    }

}
