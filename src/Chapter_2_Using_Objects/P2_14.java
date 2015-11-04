/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigjavachapter2exerciseanswers;

import javax.swing.JFrame;

/**
 * NameViewer for exercise P2.14
 *
 * @author ChrisBerryman
 */
public class P2_14 {
    
    /**
     * Initialises and displays the JFrame.
     */
    public void createAndShowGUI(){
        
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Name Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        NameComponent component = new NameComponent();
        frame.add(component);
        frame.setVisible(true);
        
    }
    
}
