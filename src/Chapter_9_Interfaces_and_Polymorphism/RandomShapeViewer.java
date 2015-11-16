package Chapter_9_Interfaces_and_Polymorphism;

import javax.swing.JFrame;

/**
 * Solution to exercise P9.19
 *
 * This program displays ten random shapes.
 *
 * @author ChrisBerryman
 */
public class RandomShapeViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        frame.setTitle("Random Shape Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RandomShapeComponent component = new RandomShapeComponent();
        frame.add(component);
        frame.setVisible(true);
    }
}
