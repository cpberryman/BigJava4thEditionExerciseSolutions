/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_2_Using_Objects;

import javax.swing.JFrame;

/**
 * EllipseViewer for exercise P2.17
 *
 * @author ChrisBerryman
 */
public class P2_17 {
    
    /**
     * Initialises and displays the JFrame.
     */
    public void createAndShowGUI() {

        JFrame frame = new JFrame();
        frame.setSize(1000, 750);
        frame.setTitle("My Elipse Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        EllipseComponent component = new EllipseComponent();
        frame.add(component);
        frame.setVisible(true);

    }
    
}
