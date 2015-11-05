package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.13
 *
 * @author ChrisBerryman
 */
public class RoachSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RoachPopulation r = new RoachPopulation(10);
        System.out.println(r.getRoaches());
        System.out.println("Expected: 10");
        r.breed();
        System.out.println(r.getRoaches());
        System.out.println("Expected: 20");
        r.spray();
        System.out.println(r.getRoaches());
        System.out.println("Expected: 18");

        r.breed();
        System.out.println(r.getRoaches());
        System.out.println("Expected: 36");
        r.spray();
        System.out.println(r.getRoaches());
        System.out.println("Expected: 33");

        r.breed();
        System.out.println(r.getRoaches());
        System.out.println("Expected: 66");
        r.spray();
        System.out.println(r.getRoaches());
        System.out.println("Expected: 60");
    }

}
