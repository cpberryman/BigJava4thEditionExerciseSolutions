package Chapter_2_Using_Objects;

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
