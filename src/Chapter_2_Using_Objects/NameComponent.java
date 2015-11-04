/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_2_Using_Objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 * NameComponent for exercise P2.14
 *
 * @author ChrisBerryman
 */
public class NameComponent extends JComponent {

    /**
     * Paints the name on the component.
     *
     * @param g the graphics instance.
     */
    @Override
    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g;
        Rectangle r = new Rectangle(50, 50, 100, 150);
        g2.setColor(Color.blue);
        g2.fill(r);
        g2.draw(r);
        g2.setColor(Color.red);
        g2.drawString("Chris", 70, 70);

    }

}
