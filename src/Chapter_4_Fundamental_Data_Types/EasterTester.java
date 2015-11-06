package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.19 
 *
 * @author ChrisBerryman
 */
public class EasterTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Easter e = new Easter();
        System.out.println(e.getEasterSundayMonth(2001));
        System.out.println("Expected: 4");
        System.out.println(e.getEasterSundayDay(2001));
        System.out.println("Expected: 15");
    }

}
