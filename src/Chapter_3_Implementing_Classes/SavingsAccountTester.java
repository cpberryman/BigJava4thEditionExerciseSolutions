package Chapter_3_Implementing_Classes;

/**
 * SavingsAccountTester for exercise P3.3.
 *
 * @author ChrisBerryman
 */
public class SavingsAccountTester {
    
    /**
     * Tests the results for exercise P3.3.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(1000, 10);
        account.addInterest();
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Expected: 1100.0");

    }
    
}
