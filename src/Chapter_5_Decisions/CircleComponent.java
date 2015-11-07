package Chapter_5_Decisions;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Solution to exercise P5.19
 *
 * @author ChrisBerryman
 */
public class CircleComponent extends JComponent {
    
    private double xTopFirst, yLeftFirst, xTopSecond, yLeftSecond;    
    private Color c;
    private Point2D.Double pointOne, pointTwo; 
    private Circle firstCircle, secondCircle;
    
    public CircleComponent(double firstRadius, double secondRadius) {

        this.xTopFirst = 100 - firstRadius;
        this.yLeftFirst = 200 - firstRadius;
        
        pointOne = new Point2D.Double(xTopFirst, yLeftFirst);
        firstCircle = new Circle(pointOne, firstRadius);       
        
        this.xTopSecond = 200 - secondRadius;
        this.yLeftSecond = 100 - secondRadius;

        pointTwo = new Point2D.Double(xTopSecond, yLeftSecond);
        secondCircle = new Circle(pointTwo, secondRadius);

    }
    
    public void checkPosition() {

        if (secondCircle.intersects(firstCircle)) {
            System.out.print("green");
            c = Color.GREEN;
        } else {
            System.out.print("red");
            c = Color.RED;
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;

        firstCircle.draw(g2, c);
        secondCircle.draw(g2, c);

    }
    
}
