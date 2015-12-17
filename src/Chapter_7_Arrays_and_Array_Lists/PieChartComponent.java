package Chapter_7_Arrays_and_Array_Lists;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Solution to exercise P7.22
 *
 * @author ChrisBerryman
 */
public class PieChartComponent extends JComponent {
    
    private final PieChart pieChart;
    
    public PieChartComponent(PieChart chart) {
        pieChart = chart;
    }
    
    /**
     * Paints the component.
     *
     * @param g the graphics instance.
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        pieChart.draw(g2);
    }
    
}
