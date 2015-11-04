/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigjavachapter2exerciseanswers;

import java.awt.Color;
import javax.swing.JFrame;

/**
 * BrighterDemo for exercise P2.7
 *
 * @author ChrisBerryman
 */
public class P2_7 {

    /**
     * Prints the colour red, green and blue values of the colour after calling
     * the Color#brighter method.
     */
    public void printColourValue() {

        Color myColor = new Color(50, 100, 150);
        Color c2 = myColor.brighter();
        System.out.println("Red:" + c2.getRed());
        System.out.println("Green:" + c2.getGreen());
        System.out.println("Blue:" + c2.getBlue());

    }

}
