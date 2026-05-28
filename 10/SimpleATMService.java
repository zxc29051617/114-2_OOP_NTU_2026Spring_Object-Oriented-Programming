public class SimpleATMService implements ATMService {
    @Override
    public boolean checkBalance(Account account, int money) throws ATMException {
        if (account.getBalance() < money) {
            throw new ATMException(ATMException.ExceptionType.BALANCE_NOT_ENOUGH);
        }
        return true;
    }

    @Override
    public boolean isValidAmount(int money) throws ATMException {
        if (money % 1000 != 0) {
            throw new ATMException(ATMException.ExceptionType.AMOUNT_INVALID);
        }
        return true;
    }

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
