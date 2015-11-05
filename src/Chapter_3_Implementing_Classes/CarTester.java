package Chapter_3_Implementing_Classes;

/**
 * Solution to exercise P3.7
 *
 * @author ChrisBerryman
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car myHybrid = new Car(50);
        myHybrid.addGas(20);
        myHybrid.drive(100);
        double gasLeft = myHybrid.getGasInTank(); 
        System.out.println(gasLeft);
        System.out.println("Expected: 18");
    }

}
