/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigjavachapter2exerciseanswers;

import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * TranslateDemo for exercise P2.6
 *
 * @author ChrisBerryman
 */
public class P2_6 {
    
    /**
     * Moves the frame to the bounds of a given rectangle.
     */
    public void showTranslate() {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        Rectangle r = new Rectangle(100, 100, 200, 300);
        frame.setBounds(r);
        
        JOptionPane.showMessageDialog(frame, "Click OK to continue");
        r.translate(200, 400);
        frame.setBounds(r);
        
        
    }
    
}
