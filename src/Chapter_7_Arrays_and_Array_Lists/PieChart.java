package Chapter_7_Arrays_and_Array_Lists;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 * Solution to exercise P7.22
 *
 * @author ChrisBerryman
 */
public class PieChart {

    private final ArrayList<Double> values = new ArrayList<>();
    private final static int PIE_CHART_WIDTH = 300;
    private final static int PIE_CHART_HEIGHT = 300;

    public void add(double value) {
        values.add(value);
    }

    /**
     * Draws the Pie Chart.
     *
     * @param g2 the graphics context.
     */
    public void draw(Graphics2D g2) {
        Ellipse2D.Double circle = new Ellipse2D.Double(25, 25, 300, 300);
        double centrePointX = circle.getCenterX();
        double centrePointY = circle.getCenterY();
        double total = getTotal();
        double startDegrees = 90;
        
        for (Double value : values) {
            double degrees = ((value / total) * 360);
            Arc2D.Double arc = new Arc2D.Double(25, 25, 300, 300, degrees, startDegrees,
                    Arc2D.OPEN);
            Point2D end = arc.getEndPoint();
            g2.draw(arc);
            g2.drawLine((int) centrePointX, (int) centrePointY, (int) end.getX(), (int) end.getY());
            startDegrees += degrees;
        }
    }

    /**
     * Returns the total of the values.
     *
     * @return the total.
     */
    public double getTotal() {
        double sum = 0;
        for (Double value : values) {
            sum += value;
        }
        return sum;
    }

}
