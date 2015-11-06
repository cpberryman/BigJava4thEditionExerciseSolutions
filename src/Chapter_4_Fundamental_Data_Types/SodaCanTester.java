package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.9
 *
 * @author ChrisBerryman.
 */
public class SodaCanTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SodaCan can = new SodaCan(10, 5);

        System.out.println(can.getVolume());
        System.out.println("Expected: 196.349540849320");
        
        System.out.println(can.getSurfaceArea());
        System.out.println("Expected: 196.349540849320");
    }

}
