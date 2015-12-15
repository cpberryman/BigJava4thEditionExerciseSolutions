package Chapter_7_Arrays_and_Array_Lists;

import java.util.ArrayList;
import java.awt.Graphics2D;

/**
 * Solution to exercise P7.19
 *
 * @author ChrisBerryman
 */
public class Chart {

    ArrayList<Integer> values = new ArrayList<>();

    /**
     * Adds a column to the chart.
     *
     * @param value
     */
    public void add(int value) {
        values.add(value);
    }

    /**
     * Draws the Chart.
     *
     * @param g2 the graphics context.
     */
    public void draw(Graphics2D g2) {
        int xAxis = 10;
        int yAxis = 140;
        for (Integer value : values) {
            g2.drawLine(xAxis, yAxis, xAxis, value);
            xAxis += 10;
        }
    }

}
