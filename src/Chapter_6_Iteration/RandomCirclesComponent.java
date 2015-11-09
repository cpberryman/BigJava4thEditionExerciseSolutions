package Chapter_6_Iteration;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

/**
 * Solution to exercise P6.18
 *
 * This class draws a given number of circles with a random diameter and
 * location.
 *
 * @author ChrisBerryman
 */
public class RandomCirclesComponent extends JComponent {

    private int numberOfCircles;
    private Random generator;

    public RandomCirclesComponent(int numberOfCircles) {
        this.numberOfCircles = numberOfCircles;
        generator = new Random();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        for (int i = 0; i < numberOfCircles; i++) {
            double diameter = generator.nextInt(100) + 10;
            Ellipse2D.Double circle = new Ellipse2D.Double(generator.nextInt(500) + 0, generator.nextInt(500) + 0, diameter, diameter);
            g2.draw(circle);
        }
    }
}
