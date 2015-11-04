/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigjavachapter2exerciseanswers;

import java.awt.Rectangle;

/**
 * FourRectanglePrinter for exercise P2.3
 *
 * @author ChrisBerryman
 */
public class P2_3 {
    
    /**
     * prints location of rectangle after each call to Rectangle#translate.
     */
    public void printFourRectangles() {
        
        Rectangle r = new Rectangle(5, 10, 20, 30);
        System.out.println(r);
        r.translate(20, 0);
        System.out.println(r);
        r.translate(0, 30);
        System.out.println(r);
        r.translate(-20, 0);
        System.out.println(r);
        
    }
    
    
}
