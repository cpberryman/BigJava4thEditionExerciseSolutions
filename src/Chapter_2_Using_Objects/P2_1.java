/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigjavachapter2exerciseanswers;

import java.awt.Rectangle;

/**
 * AreaTester program for exercise P2.1
 *
 * @author ChrisBerryman
 */
public class P2_1 {

    /**
     * Computes area of rectangle and prints the answer.
     */
    public void testArea() {

        Rectangle r = new Rectangle(10, 20);
        int area = r.height * r.width;

        System.out.println("Area: " + area);
        System.out.println("Expected: 200");

    }

}
