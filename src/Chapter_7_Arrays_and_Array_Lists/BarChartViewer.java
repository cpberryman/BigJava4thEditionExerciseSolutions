package Chapter_7_Arrays_and_Array_Lists;

import javax.swing.JFrame;

/**
 * Solution to exercise P7.20 and P7.21
 *
 * @author ChrisBerryman
 */
public class BarChartViewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 900;

        JFrame frame = new JFrame("Bar Chart Viewer");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        BarChart c = new BarChart();
        c.add(100.10);
        c.add(-100);
        c.add(360);
        c.add(400);
        c.add(370);
        c.add(-210);
        c.add(270);
        c.add(260);

        BarChartComponent component = new BarChartComponent(c);

        frame.add(component);
        frame.setVisible(true);
    }

}
