package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.5
 *
 * @author ChrisBerryman.
 */
public class IceCreamConeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IceCreamCone cone = new IceCreamCone(10, 5);
        System.out.println(cone.getSurfaceArea());
        System.out.println("Expected: 175.62");
        System.out.println(cone.getVolume());
        System.out.println("Expected: 261.799");
    }

}
