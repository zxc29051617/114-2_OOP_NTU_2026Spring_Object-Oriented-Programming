public class ATMException extends Exception {
    public enum ExceptionType {
        BALANCE_NOT_ENOUGH,
        AMOUNT_INVALID
    }

    private ExceptionType excptionCondition;

    public ATMException(ATMException.ExceptionType exType) {
        excptionCondition = exType;
    }

    @Override
    public String getMessage() {
        return excptionCondition.name();
    }
}
