package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.12
 * 
 * @author ChrisBerryman
 */
public class StampMachineTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StampMachine machine = new StampMachine();
        machine.insert(3);
        System.out.println("Number of first class stamps: " + machine.giveFirstClassStamps());
        System.out.println("Expected: 6");
        System.out.println("Number of penny stamps: " + machine.givePennyStamps());
        System.out.println("Expected: 36");
    }
    
}
