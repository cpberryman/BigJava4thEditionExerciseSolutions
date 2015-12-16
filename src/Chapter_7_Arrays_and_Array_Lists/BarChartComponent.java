package Chapter_7_Arrays_and_Array_Lists;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Solution to exercise P7.20 and P7.21
 *
 * @author ChrisBerryman
 */
public class BarChartComponent extends JComponent {
    
    private final BarChart chart;

    public BarChartComponent(BarChart c) {
        chart = c;
    }
    
    /**
     * Paints the component.
     *
     * @param g the graphics instance.
     */
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        chart.draw(g2);
    }
    
}
