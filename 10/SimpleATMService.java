/**
 * Implements an ATM service that supports withdrawals in thousand-dollar units.
 */
public class SimpleATMService implements ATMService {

    /**
     * Creates a simple ATM withdrawal service.
     */
    public SimpleATMService() {
    }

    /**
     * Checks whether an account has enough money for a withdrawal.
     *
     * @param account the account to check
     * @param money the requested withdrawal amount
     * @return {@code true} when the balance is sufficient
     * @throws ATMException if the balance is insufficient
     */
    @Override
    public boolean checkBalance(Account account, int money) throws ATMException {
        if (account.getBalance() < money) {
            throw new ATMException(ATMException.ExceptionType.BALANCE_NOT_ENOUGH);
        }
        return true;
    }

    /**
     * Checks whether a withdrawal amount is divisible by one thousand.
     *
     * @param money the requested withdrawal amount
     * @return {@code true} when the amount is valid
     * @throws ATMException if the amount is invalid
     */
    @Override
    public boolean isValidAmount(int money) throws ATMException {
        if (money % 1000 != 0) {
            throw new ATMException(ATMException.ExceptionType.AMOUNT_INVALID);
        }
        return true;
    }

    /**
     * Attempts a withdrawal and always prints the updated account balance.
     *
     * @param account the account to debit
     * @param money the requested withdrawal amount
     */
    @Override
    public void withdraw(Account account, int money) {
        try {
            checkBalance(account, money);
            isValidAmount(money);
            account.setBalance(account.getBalance() - money);
        } catch (ATMException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("updated balance : " + account.getBalance());
    }
}
