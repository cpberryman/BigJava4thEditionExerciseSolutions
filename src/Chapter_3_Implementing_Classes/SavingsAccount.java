package Chapter_3_Implementing_Classes;

/**
 * SavingsAccount for exercise P3.3.
 *
 * @author ChrisBerryman
 */
public class SavingsAccount {
    
    private double balance;
    private final double interest;

    /**
     * Constructs a savings account with a given balance and interest rate.
     *
     * @param initialBalance the initial balance.
     * @param interestRate the interest rate.
     */
    public SavingsAccount(double initialBalance, double interestRate) {
        balance = initialBalance;
        interest = interestRate;
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    }

    /**
     * Gets the current balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Adds the interest to an account.     *
     */
    public void addInterest() {       
        balance += interest / 100 * balance;        
    }
    
}
