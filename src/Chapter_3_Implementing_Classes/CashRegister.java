package Chapter_3_Implementing_Classes;

/**
 * CashRegister for exercise P3.4, P3.5
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
    
}
