/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigjavachapter2exerciseanswers;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

/**
 * FaceComponent for exercise P2.18
 *
 * @author ChrisBerryman
 */
public class FaceComponent extends JComponent{    
    
    /**
     * Paints the face on the component.
     *
     * @param g the graphics instance.
     */
    @Override
    public void paintComponent (Graphics g){
        
        Graphics2D g2 = (Graphics2D) g;
        
        Ellipse2D.Double e = new Ellipse2D.Double(50, 50, 100, 100);
        Ellipse2D.Double eye1 = new Ellipse2D.Double(75, 75, 10, 10);
        Ellipse2D.Double eye2 = new Ellipse2D.Double(115, 75, 10, 10);
        Point2D.Double p1 = new Point2D.Double(75, 125);
        Point2D.Double p2 = new Point2D.Double(125, 125);
        Line2D.Double mouth = new Line2D.Double(p1, p2);
        
        BasicStroke s = new BasicStroke(1);        
        g2.setColor(Color.blue);
        g2.setStroke(s);
        g2.draw(e);
        g2.draw(eye1);
        g2.draw(eye2);
        g2.draw(mouth);
        
        
    }
    
}
