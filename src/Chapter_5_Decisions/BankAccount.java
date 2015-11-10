package Chapter_5_Decisions;

/**
 * Solution to exercise P5_1
 *
 * @author Chris
 */
public class BankAccount {

    /**
     * Bank account class from the Big Java book.
     *
     * A bank account has a balance that can be changed by deposits and
     * withdrawals.
     */
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
        if(amount > 0) {
          balance += amount;  
        }
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        if (amount > 0) {
            if (canWithdraw(amount)) {
                balance = balance - amount;
            }
        }
    }

    /**
     * Checks if amount to withdraw does not exceed balance
     *
     * @param amount the amount to withdraw
     * @return a boolean value
     */
    public boolean canWithdraw(double amount) {
        return balance >= amount;
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
