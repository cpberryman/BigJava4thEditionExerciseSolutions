package Chapter_3_Implementing_Classes;

/**
 * Bank account class from the Big Java book.
 *
 * A bank account has a balance that can be changed by deposits and withdrawals.
 */
public class BankAccount {

    private double balance;

    /**
     * Constructs a bank account with a zero balance.
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     *
     * @param initialBalance the initial balance
     */
    public BankAccount(double initialBalance) {
        balance = initialBalance;
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
     * Solution to exercise P3.2
     * 
     * Adds interest to an account based on a given interest rate.
     *
     * @param rate the interest rate.
     */
    public void addInterest(double rate) {        
        double interest = rate / 100;
        balance += interest * balance;        
    }

}
