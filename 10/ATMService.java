/**
 * Defines the operations provided by an ATM withdrawal service.
 */
public interface ATMService {

    /**
     * Checks whether an account has enough money for a withdrawal.
     *
     * @param account the account to check
     * @param money the requested withdrawal amount
     * @return {@code true} when the balance is sufficient
     * @throws ATMException if the account balance is insufficient
     */
    public boolean checkBalance(Account account, int money) throws ATMException;

    /**
     * Checks whether a withdrawal amount is divisible by one thousand.
     *
     * @param money the requested withdrawal amount
     * @return {@code true} when the amount is valid
     * @throws ATMException if the amount is invalid
     */
    public boolean isValidAmount(int money) throws ATMException;

    /**
     * Attempts to withdraw money and prints the resulting balance.
     *
     * @param account the account to debit
     * @param money the requested withdrawal amount
     */
    public void withdraw(Account account, int money);
}
