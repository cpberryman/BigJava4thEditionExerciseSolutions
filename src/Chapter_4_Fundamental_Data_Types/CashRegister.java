package Chapter_4_Fundamental_Data_Types;

/**
 * Solution to exercise P4.1, P4.2 and P4.11
 *
 * A cash register totals up sales and computes change due.
 * 
 * @author ChrisBerryman
 */
public class CashRegister {

    private double purchase;
    private double payment;
    private double taxRate;
    private double totalTax;
    private double totalSales;
    private int salesCount;
    private int itemCount;

    public static final double QUARTER_VALUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;

    public static final int PENNIES_PER_NICKEL = 5;
    public static final int PENNIES_PER_DIME = 10;
    public static final int PENNIES_PER_QUARTER = 25;
    public static final int PENNIES_PER_DOLLAR = 100;

    /**
     * Constructs a cash register with no money in it.
     */
    public CashRegister() {

    }

    /**
     * Constructs a cash register with no money in it.
     *
     * @param rate the current tax rate
     */
    public CashRegister(double rate) {
        this.taxRate = rate;
    }

    /**
     * Records the sale of an item.
     *
     * @param amount the price of the item
     */
    public void recordPurchase(double amount) {
        purchase = purchase + amount;
        itemCount++;
    }

    /**
     * Enters the payment received from the customer.
     *
     * @param amount the amount of the payment
     */
    public void enterPayment(double amount) {
        payment = payment + amount;
    }

    /**
     * Computes the change due and resets the machine for the next customer.
     *
     * @return the change due to the customer
     */
    public double giveChange() {

        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        itemCount = 0;
        return change;

    }

    /**
     * Adds tax to and records the sale of a taxable item
     *
     * @param amount the price of the item
     */
    public void recordTaxablePurchase(double amount) {

        double tax = amount * taxRate / 100;
        double total = amount + tax;
        purchase += total;
        totalTax += tax;
        totalSales += total;
        salesCount++;

    }

    /**
     * Computes the total tax amount paid for purchased items
     *
     * @return the total tax paid for the transaction
     */
    public double getTotalTax() {
        return totalTax;
    }

    /**
     * Computes the total sum of sales from the day
     *
     * @return the sum of all sales from the day
     */
    public double getSalesTotal() {
        return totalSales;
    }

    /**
     * Computes the total number of sales of the day
     *
     * @return the number of sales from the day
     */
    public int getSalesCount() {
        return salesCount;
    }

    /**
     * Resets the counters and totals so the next day's transactions start at 0
     */
    public void reset() {
        purchase = 0;
        payment = 0;
        totalTax = 0;
        totalSales = 0;
        salesCount = 0;
    }

    /**
     * Stores the number of dollars entered as a payment.
     *
     * @param dollars the number of dollars given
     */
    public void enterDollars(int dollars) {
        payment += dollars;
    }

    /**
     * Stores the number of quarters entered as a payment.
     *
     * @param quarters the number of dollars given
     */
    public void enterQuarters(int quarters) {
        payment += quarters * QUARTER_VALUE;
    }

    /**
     * Stores the number of dimes entered as a payment.
     *
     * @param dimes the number of dollars given
     */
    public void enterDimes(int dimes) {
        payment += dimes * DIME_VALUE;
    }

    /**
     * Stores the number of nickels entered as a payment.
     *
     * @param nickels the number of dollars given
     */
    public void enterNickels(int nickels) {
        payment += nickels * NICKEL_VALUE;
    }

    /**
     * Stores the number of pennies entered as a payment.
     *
     * @param pennies the number of dollars given
     */
    public void enterPennies(int pennies) {
        payment += pennies * PENNY_VALUE;
    }

    /**
     * Returns the number of items of the current purchase
     *
     * @return the number of items purchased in a single transaction
     */
    public int getItemCount() {
        return itemCount;
    }

    /**
     * Computes the number of dollars to return to the customer
     *
     * @return the change in dollars;
     */
    public int giveDollars() {
        int dollars = (int) (payment - purchase);
        return dollars;
    }

    /**
     * Computes the number of quarters to return to the customer
     *
     * @return the change in quarters;
     */
    public int giveQuarters() {
        double change = payment - purchase;
        int pennies = (int) Math.round((change % 1) * PENNIES_PER_DOLLAR);
        int quarters = (int) pennies / PENNIES_PER_QUARTER;
        return quarters;
    }

    /**
     * Computes the number of dimes to return to the customer
     *
     * @return the change in dimes;
     */
    public int giveDimes() {
        double change = payment - purchase;
        int pennies = (int) Math.round((change % 1) * PENNIES_PER_DOLLAR);
        int dimes = (int) (pennies - (giveQuarters() * PENNIES_PER_QUARTER)) / PENNIES_PER_DIME;

        return dimes;
    }

    /**
     * Computes the number of nickels to return to the customer
     *
     * @return the change in nickels;
     */
    public int giveNickels() {        
        double change = payment - purchase;
        int pennies = (int) Math.round((change % 1) * PENNIES_PER_DOLLAR);
        int nickels = (int) (pennies - ((giveQuarters() * PENNIES_PER_QUARTER) + 
                (giveDimes() * PENNIES_PER_DIME))) / PENNIES_PER_NICKEL;
        
        return nickels;

    }

    /**
     * Computes the number of pennies to return to the customer
     *
     * @return the change in pennies;
     */
    public int givePennies() {
        
        double change = payment - purchase;
        int pennies = (int) Math.round((change % 1) * PENNIES_PER_DOLLAR);
        int cents = (int) (pennies - ((giveQuarters() * PENNIES_PER_QUARTER) + 
                (giveDimes() * PENNIES_PER_DIME) + (giveNickels() * PENNIES_PER_NICKEL))) / 1;
        
        return cents;
        
    }
}
