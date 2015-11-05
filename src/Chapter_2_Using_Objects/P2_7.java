package Chapter_2_Using_Objects;

import java.awt.Color;

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
