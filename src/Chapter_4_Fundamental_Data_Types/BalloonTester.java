package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.10
 *
 * @author ChrisBerryman
 */
public class BalloonTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Balloon b = new Balloon();
        b.addAir(100);
        System.out.println("Volume: " + b.getVolume());
        System.out.println("Expected: 100");
        System.out.print("Radius: ");
        System.out.printf("%4.2f", b.getRadius());
        System.out.println("\nExpected: 2.88");
        System.out.print("Surface Area: ");
        System.out.printf("%4.2f", b.getSurfaceArea());
        System.out.println("\nExpected: 104.19");
        b.addAir(100);
        System.out.println("Volume" + b.getVolume());
        System.out.println("Expected: 200");
        System.out.print("Radius: ");
        System.out.printf("%4.2f", b.getRadius());
        System.out.println("\nExpected: 3.63");
        System.out.print("Surface Area: ");
        System.out.printf("%4.2f", b.getSurfaceArea());
        System.out.println("\nExpected: 165.39");
    }
    
}
