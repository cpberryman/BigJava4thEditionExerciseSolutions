/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_2_Using_Objects;

/**
 * HollePrinter for exercise P2.13
 *
 * @author ChrisBerryman
 */
public class P2_13 {
    
    /**
     * Switches the letters "e" and "o" in the string "Hello, World!".
     */
    public void switchLetters() {
        
        String hw = "Hello, World!";
        hw = hw.replace("ello", "olle"); 
        hw = hw.replace("or", "er");
        System.out.println(hw);
        
    }
    
}
