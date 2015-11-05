package Chapter_3_Implementing_Classes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.BasicStroke;

/**
 * Solution to exercise P3.21
 *
 * @author ChrisBerryman
 *
 * Displays the Olympic rings.
 */
public class OlympicRingComponent extends JComponent {


    @Override
    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(50, 50, 100, 100);
        Color c = Color.BLUE;
        Color c2 = Color.BLACK;
        Color c3 = Color.RED;
        Color c4 = Color.GREEN;
        Color c5 = Color.YELLOW;
        BasicStroke s = new BasicStroke(8);
        g2.setStroke(s);
        g2.setColor(c);
        g2.draw(circle);

        g2.translate(106, 0);
        g2.setColor(c2);
        g2.draw(circle);
        g2.translate(106, 0);
        g2.setColor(c3);
        g2.draw(circle);
        g2.translate(-50, 50);
        g2.setColor(c4);
        g2.draw(circle);
        g2.translate(-106, 0);
        g2.setColor(c5);
        g2.draw(circle);


    }

}
