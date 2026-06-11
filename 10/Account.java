/**
 * Represents a bank account with an integer balance.
 */
public class Account {

    /**
     * Stores the current account balance.
     */
    private int balance;

    /**
     * Creates an account with the specified initial balance.
     *
     * @param balance the initial balance
     */
    public Account(int balance) {
        setBalance(balance);
    }

    /**
     * Returns the current account balance.
     *
     * @return the current balance
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Updates the account balance.
     *
     * @param balance the new balance
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
