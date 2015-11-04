package Chapter_3_Implementing_Classes;

/**
 * BankAccountTester for exercise P3.1.
 *
 * @author ChrisBerryman
 */
public class BankAccountTester {

    /**
     * Tests the results for exercise P3.1 and P3.2.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        account.withdraw(400);
        System.out.println("Remaining balance: " + account.getBalance());
        System.out.println("Expected: 100.0");

        BankAccount momsSavings = new BankAccount(1000);
        momsSavings.addInterest(10);
        System.out.println("Balance: " + momsSavings.getBalance());
        System.out.println("Expected: 1100.0");

    }

}
