import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * Maintains a running result and performs simple arithmetic commands.
 */
public class SimpleCalculator {

    /**
     * Stores the current unrounded calculation result.
     */
    private double result;

    /**
     * Stores the number of successful calculations.
     */
    private int calculationCount;

    /**
     * Stores the operator used by the latest successful command.
     */
    private String lastOperator;

    /**
     * Stores the value used by the latest successful command.
     */
    private double lastValue;

    /**
     * Indicates whether the calculation has ended.
     */
    private boolean finished;

    /**
     * Creates a calculator whose initial result is zero.
     */
    public SimpleCalculator() {
    }

    /**
     * Parses a command and updates the running result.
     *
     * @param cmd the command containing one operator and one value
     * @throws UnknownCmdException if the command is invalid
     */
    public void calResult(String cmd) throws UnknownCmdException {
        String[] parts = parseCommand(cmd);
        String operator = parts[0];
        String valueText = parts[1];

        boolean invalidOperator = !isValidOperator(operator);
        Double value = parseValue(valueText);
        boolean invalidValue = value == null;

        if (invalidOperator && invalidValue) {
            throw new UnknownCmdException(operator + " is an unknown operator and " + valueText + " is an unknown value");
        }
        if (invalidOperator) {
            throw new UnknownCmdException(operator + " is an unknown operator");
        }
        if (invalidValue) {
            throw new UnknownCmdException(valueText + " is an unknown value");
        }
        if (operator.equals("/") && value == 0.0) {
            throw new UnknownCmdException("Can not divide by 0");
        }

        switch (operator) {
            case "+":
                result += value;
                break;
            case "-":
                result -= value;
                break;
            case "*":
                result *= value;
                break;
            case "/":
                result /= value;
                break;
            default:
                break;
        }

        lastOperator = operator;
        lastValue = value;
        calculationCount++;
    }

    /**
     * Returns the status message for the current calculation state.
     *
     * @return the current calculator message
     */
    public String getMsg() {
        if (finished) {
            return "Final result = " + format(result);
        }
        if (calculationCount == 0) {
            return "Calculator is on. Result = " + format(result);
        }

        String status = calculationCount == 1 ? "New" : "Updated";
        return "Result " + lastOperator + " " + format(lastValue) + " = " + format(result)
                + ". " + status + " result = " + format(result);
    }

    /**
     * Checks whether the command requests the final result.
     *
     * @param cmd the command to check
     * @return {@code true} if the command is {@code r} or {@code R}
     */
    public boolean endCalc(String cmd) {
        if (cmd != null && cmd.equalsIgnoreCase("r")) {
            finished = true;
            return true;
        }
        return false;
    }

    /**
     * Splits a command that contains exactly one separating space.
     *
     * @param cmd the command to parse
     * @return the operator and value text
     * @throws UnknownCmdException if the command format is invalid
     */
    private String[] parseCommand(String cmd) throws UnknownCmdException {
        if (cmd == null) {
            throw new UnknownCmdException("Please enter 1 operator and 1 value separated by 1 space");
        }

        String[] parts = cmd.split(" ", -1);
        if (parts.length != 2 || parts[0].length() == 0 || parts[1].length() == 0) {
            throw new UnknownCmdException("Please enter 1 operator and 1 value separated by 1 space");
        }
        return parts;
    }

    /**
     * Checks whether an operator is supported.
     *
     * @param operator the operator to check
     * @return {@code true} for addition, subtraction, multiplication, or division
     */
    private boolean isValidOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
    }

    /**
     * Parses a finite real number from text.
     *
     * @param valueText the text to parse
     * @return the parsed value, or {@code null} if parsing fails
     */
    private Double parseValue(String valueText) {
        try {
            double value = Double.parseDouble(valueText);
            if (Double.isNaN(value) || Double.isInfinite(value)) {
                return null;
            }
            return value;
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * Formats a number with two decimal places.
     *
     * @param number the number to format
     * @return the formatted number
     */
    private String format(double number) {
        DecimalFormat formatter = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US));
        formatter.setRoundingMode(RoundingMode.HALF_UP);
        return formatter.format(number);
    }
}
