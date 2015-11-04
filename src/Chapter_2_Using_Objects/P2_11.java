/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_2_Using_Objects;

import java.util.Random;

/**
 * LotteryPrinter for exercise P2.11
 *
 * @author ChrisBerryman
 */
public class P2_11 {
    
    /**
     * Prints a random combination of six numbers.
     */
    public void printCombination() {
        
        Random generator = new Random();
        int firstNumber = generator.nextInt(49) + 1;
        int secondNumber = generator.nextInt(49) + 1;
        int thirdNumber = generator.nextInt(49) + 1;
        int forthNumber = generator.nextInt(49) + 1;
        int fithNumber = generator.nextInt(49) + 1;
        int sixthNumber = generator.nextInt(49) + 1;
        System.out.println("Play this combination—it’ll make you rich!");
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(forthNumber);
        System.out.println(fithNumber);
        System.out.println(sixthNumber);
        
    }
    
}
