package Chapter_9_Interfaces_and_Polymorphism;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random;
import java.awt.Shape;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * Solution to exercise P9.19
 *
 A random shape component contains random shapes.
 *
 * @author Chris
 */
public class RandomShapeComponent extends JComponent {

    private final Random generator = new Random();
    private Shape s;

    /**
     * Generates random objects which implement the {@code}Shape interface.
     *
     * @return a random shape
     */
    public Shape randomShape() {
        int shapeNumber = generator.nextInt(3) + 1;
        int positionX = generator.nextInt(500) + 10;
        int positionY = generator.nextInt(500) + 10;
        switch(shapeNumber) {
            case 1:
                s = (Rectangle) new Rectangle(positionX, positionY, 100, 50);
                break;
            case 2:
                s = (Ellipse2D.Double) new Ellipse2D.Double(positionX, positionY, 50, 50);
                break;
            case 3:
                int toPositionX = generator.nextInt(500) + 10;
                int toPositionY = generator.nextInt(500) + 10;
                s = (Line2D.Double) new Line2D.Double(positionX, positionY, toPositionX, toPositionY);
                break;
        }
        return s;
    }


    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < 10; i++) {
            randomShape();
            g2.draw(s);
        }
    }

}
