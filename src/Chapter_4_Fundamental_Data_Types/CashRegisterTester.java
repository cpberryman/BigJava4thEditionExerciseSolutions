package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.1 and P4.11
 *
 * @author ChrisBerryman
 */
public class CashRegisterTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister register = new CashRegister();
        register.recordPurchase(20.37);
        register.enterDollars(20);
        register.enterQuarters(2);
        System.out.println("Change: " + register.giveChange());
        System.out.println("Expected: 0.13");

        CashRegister register2 = new CashRegister();
        register2.recordPurchase(8.37);
        register2.enterPayment(10);
        System.out.println("Dollars: " + register2.giveDollars());
        System.out.println("Expected: 1");
        System.out.println("Quarters: " + register2.giveQuarters());
        System.out.println("Expected: 2");
        System.out.println("Dimes: " + register2.giveDimes());
        System.out.println("Expected: 1");
        System.out.println("Nickels: " + register2.giveNickels());
        System.out.println("Expected: 0");
        System.out.println("Pennies: " + register2.givePennies());
        System.out.println("Expected: 3");
    }

}
