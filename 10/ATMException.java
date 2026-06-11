/**
 * Reports a failed ATM withdrawal validation.
 */
public class ATMException extends Exception {

    /**
     * Lists the validation errors that can occur during a withdrawal.
     */
    public enum ExceptionType {
        /**
         * The account balance is lower than the requested amount.
         */
        BALANCE_NOT_ENOUGH,

        /**
         * The requested amount cannot be dispensed by the ATM.
         */
        AMOUNT_INVALID
    }

    /**
     * Stores the condition that caused this exception.
     */
    private ExceptionType excptionCondition;

    /**
     * Creates an ATM exception for the specified condition.
     *
     * @param exType the condition that caused the exception
     */
    public ATMException(ATMException.ExceptionType exType) {
        excptionCondition = exType;
    }

    /**
     * Returns the name of the exception condition.
     *
     * @return the exception condition name
     */
    @Override
    public String getMessage() {
        return excptionCondition.name();
    }
}
