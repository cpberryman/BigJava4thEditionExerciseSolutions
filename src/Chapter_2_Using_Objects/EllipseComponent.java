package Chapter_2_Using_Objects;

import java.awt.BasicStroke;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 * EllipseComponent for exercise P2.17
 *
 * @author ChrisBerryman
 */
public class EllipseComponent extends JComponent {

    /**
     * Paints the ellipse on the component.
     *
     * @param g the graphics instance.
     */
    @Override
    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        Ellipse2D.Double e = new Ellipse2D.Double(0, 0, this.getWidth(), this.getHeight());
        BasicStroke s = new BasicStroke(3);

        g2.setColor(Color.blue);
        g2.fill(e);
        g2.setColor(Color.black);
        g2.setStroke(s);
        g2.draw(e);

    }

}
