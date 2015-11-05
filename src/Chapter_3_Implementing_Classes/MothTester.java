package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.12
 *
 * @author ChrisBerryman
 */
public class MothTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Moth m = new Moth(150);
        System.out.println(m.getPosition());
        System.out.println("Expected: 150");
        m.moveToLight(200);
        System.out.println(m.getPosition());
        System.out.println("Expected: 175");
        m.moveToLight(10);
        System.out.println(m.getPosition());
        System.out.println("Expected: 82.5");
    }

}
