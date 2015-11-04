/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigjavachapter2exerciseanswers;

import java.awt.Rectangle;

/**
 * GrowSquarePrinter for exercise P2.4
 *
 * @author ChrisBerryman
 */
public class P2_4 {
    
    /**
     * Grows the square by calling Rectangle#translate and Rectangle#grow.
     */
    public void GrowSquare() {
        
        Rectangle s = new Rectangle(100, 100, 50, 50);
        System.out.println(s);
        s.translate(50, 50);        
        s.grow(25, 25);
        s.translate(-25, -25);
        System.out.println(s);
        
    }
    
}
