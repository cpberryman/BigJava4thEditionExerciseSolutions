package Chapter_8_Designing_Classes;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Solution to exercise 8.2
 *
 * @author ChrisBerryman
 */
public class CashRegister {

    private double purchase, payment, remainingChange, totalSales;
    private int itemCount, salesCount;

    /**
     * Constructs an international cash register with no money in it.
     */
    public CashRegister() {

    }

    /**
     * Records the sale of an item.
     *
     * @param amount the price of the item
     */
    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++;
        salesCount++;
        totalSales += amount;

    }

    /**
     * Enters the payment received from the customer.
     *
     * @param coinCount the number of coins
     * @param coinType the type of coin
     */
    public void enterPayment(int coinCount, Coin coinType) {
        payment += coinCount * coinType.getValue();
    }

    /**
     * Computes the change due and resets the machine for the next customer.
     *
     * @param coinType the type of coin to give change for
     * @return the number of coins due to the customer
     */
    public int giveChange(Coin coinType) {
        int coinNumber;
        double change = payment - purchase;
        if (coinType.getValue() >= 1) {
            coinNumber = (int) (change / coinType.getValue());
        } else {
            MathContext context = new MathContext(3);
            BigDecimal changeRounded = new BigDecimal(change).round(context);
            BigDecimal value = new BigDecimal(coinType.getValue());
            coinNumber = (changeRounded.divide(value, 1, RoundingMode.HALF_UP).intValue());

        }
        remainingChange = change - coinNumber * coinType.getValue();
        return coinNumber;
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
        totalSales = 0;
        salesCount = 0;
    }

}
