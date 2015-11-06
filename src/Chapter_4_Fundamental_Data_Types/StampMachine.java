package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.12
 * 
 * A postage stamp vending machine receives money and computes first class
 * stamps to be printed and change due.
 *
 * @author ChrisBerryman
 */
public class StampMachine {

    public static final int FIRST_CLASS_STAMP_PRICE = 44;
    public static final int PENNIES_PER_DOLLAR = 100;
    private int balance;

    
    /**
     * Constructs a stamp machine with no money inserted.
     */
    public StampMachine() {        
        balance = 0;
        
    }
    
    /**
     * Sets the balance to the inserted amount of dollars.
     * @param dollars the amount of dollars inserted.
     */
    public void insert(int dollars) {        
        balance += dollars;        
    }
    
    /**
     * Returns the amount of first class stamps to be printed.
     * @return the number of stamps.
     */
    public int giveFirstClassStamps() {        
        int firstClassStamps = (int) ((balance * PENNIES_PER_DOLLAR) / FIRST_CLASS_STAMP_PRICE);
        return firstClassStamps;        
    }
    
    /**
     * Returns the change due in pennies or penny stamps.
     * @return the change due.
     */
    public int givePennyStamps() {         
        int pennies = balance * PENNIES_PER_DOLLAR;        
        int pennyStamps = (int) (pennies - (giveFirstClassStamps() * FIRST_CLASS_STAMP_PRICE));
        return pennyStamps;        
    }

}
