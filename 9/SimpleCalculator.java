import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class SimpleCalculator {
    private double result;
    private int calculationCount;
    private String lastOperator;
    private double lastValue;
    private boolean finished;

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

    public boolean endCalc(String cmd) {
        if (cmd != null && cmd.equalsIgnoreCase("r")) {
            finished = true;
            return true;
        }
        return false;
    }

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

    private boolean isValidOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
    }

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

    private String format(double number) {
        DecimalFormat formatter = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US));
        formatter.setRoundingMode(RoundingMode.HALF_UP);
        return formatter.format(number);
    }
}
