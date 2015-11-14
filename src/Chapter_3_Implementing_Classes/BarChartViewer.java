package Chapter_3_Implementing_Classes;

import javax.swing.JFrame;

/**
 * Solution to exercise P3.22
 *
 * @author ChrisBerryman
 */
public class BarChartViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 400);
        frame.setTitle("Longest Bridge Spans");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BarChartComponent component = new BarChartComponent();
        frame.add(component);
        frame.setVisible(true);
    }

}
