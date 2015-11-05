package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.11
 *
 * @author ChrisBerryman
 */
public class BugTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Bug bugsy = new Bug(10);
        bugsy.move(); // now the position is 11
        int position = bugsy.getPosition();
        System.out.println(position);
        System.out.println("Expected: 11");
        bugsy.turn();
        bugsy.move(); // now the position is 10
        int position2 = bugsy.getPosition();
        System.out.println(position2);
        System.out.println("Expected: 10");
    }

}
