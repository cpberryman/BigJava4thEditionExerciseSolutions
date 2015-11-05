package Chapter_2_Using_Objects;

import java.awt.Rectangle;

/**
 * IntersectionPrinter for exercise P2.5
 *
 * @author ChrisBerryman
 */
public class P2_5 {

    /**
     * prints the rectangle object which describes the intersection.
     */
    public void printIntersection() {
        Rectangle r1 = new Rectangle(5, 10, 20, 30);
        Rectangle r2 = new Rectangle(10, 20, 30, 20);
        Rectangle r3 = r1.intersection(r2);
        System.out.println(r3);
    }

}
