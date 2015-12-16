package Chapter_7_Arrays_and_Array_Lists;

import java.util.ArrayList;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 * Solution to exercise P7.20 and P7.21
 *
 * @author ChrisBerryman
 */
public class BarChart {

    private final ArrayList<Double> values = new ArrayList<>();
    private static final int COLUMN_WIDTH = 40;

    /**
     * Adds a column to the chart.
     *
     * @param value the value of the column.
     */
    public void add(double value) {
        values.add(value);
    }

    /**
     * Draws the Bar Chart.
     *
     * @param g2 the graphics context.
     */
    public void draw(Graphics2D g2) {
        int xLeft = 0;
        double max = getMaximum();
        for (Double value : values) {
            if (value < 0) {                
                double yTop = max;
                g2.draw(new Rectangle2D.Double(xLeft, yTop, COLUMN_WIDTH, Math.abs(value)));
            } else {
                double yTop = (max - value);
                g2.draw(new Rectangle2D.Double(xLeft, yTop, COLUMN_WIDTH, value));
            }
            xLeft += COLUMN_WIDTH;
        }
    }

    /**
     * Gets the maximum value.
     *
     * @return the maximum value.
     */
    public double getMaximum() {
        double max = values.get(0);
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i) > max) {
                max = values.get(i);
            }
        }
        return max;
    }

}
