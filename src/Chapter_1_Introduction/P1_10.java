/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_1_Introduction;

import javax.swing.JOptionPane;

/**
 * Answer to Big Java programming exercise P1.10
 *
 * @author ChrisBerryman
 */
public class P1_10 {

    /**
     * Displays an option pane and prints “Hello, name!” to the console.
     */
    public void showDialog() {
        
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println("Hello " + name + "!");
        System.exit(0);

    }

}
