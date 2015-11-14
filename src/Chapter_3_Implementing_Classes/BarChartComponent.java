package Chapter_3_Implementing_Classes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 * Solution to exercise P3.22
 *
 *  Plots a given data set
 *
 * @author ChrisBerryman
 */
public class BarChartComponent extends JComponent {

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString("Bridge Name", 10, 20);
        g2.drawString("Golden Gate", 10, 65);
        g2.drawString("Brooklyn", 10, 110);
        g2.drawString("Delaware Memorial", 10, 155);
        g2.drawString("Mackinac", 10, 200);
        g2.drawString("Longest Span (ft)", 225, 240);
        Rectangle goldenGate = new Rectangle(120, 50, 420, 20);
        g2.drawString("4,200", 550, 65);
        Rectangle brooklyn = new Rectangle(120, 95, 160, 20);
        g2.drawString("1,595", 290, 110);
        Rectangle delawareMemorial = new Rectangle(120, 140, 215, 20);
        g2.drawString("2,150", 345, 155);
        Rectangle mackinac = new Rectangle(120, 185, 380, 20);
        g2.drawString("3,800", 510, 200);
        g2.draw(goldenGate);
        g2.draw(brooklyn);
        g2.draw(delawareMemorial);
        g2.draw(mackinac);
    }

}
