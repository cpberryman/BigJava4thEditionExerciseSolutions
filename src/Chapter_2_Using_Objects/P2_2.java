package Chapter_2_Using_Objects;

import java.awt.Rectangle;

/**
 * PerimeterTester program for exercise P2.2
 *
 * @author ChrisBerryman
 */
public class P2_2 {
    
    /**
     * Computes perimeter of rectangle and prints the answer.
     */
    public void testPerimeter() {        
        Rectangle r = new Rectangle(10, 20);
        int perimeter = r.height + r.width + r.height + r.width;         
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Expected: 60");       
        
    }
    
}
