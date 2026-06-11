/**
 * Reports an invalid calculator command.
 */
public class UnknownCmdException extends Exception {

    /**
     * Creates an exception with the specified error message.
     *
     * @param errMessage the command error message
     */
    public UnknownCmdException(String errMessage) {
        super(errMessage);
    }
}
