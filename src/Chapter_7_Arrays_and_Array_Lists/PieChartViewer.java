package Chapter_7_Arrays_and_Array_Lists;

import javax.swing.JFrame;

/**
 * Solution to exercise P7.22
 *
 * @author ChrisBerryman
 */
public class PieChartViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pie Chart Viewer");
        final int FRAME_WIDTH = 400;
        final int FRAME_HEIGHT = 400;
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        PieChart c = new PieChart();
        c.add(4);
        c.add(5);
        c.add(6);
        c.add(1);
        c.add(4);
        PieChartComponent component = new PieChartComponent(c);
        frame.add(component);
        frame.setVisible(true);
    }

}
