/**
 * Determines whether a given year is a leap year.
 */
public class IsLeapYear {

    /**
     * Creates a leap-year checker.
     */
    public IsLeapYear() {
    }

    /**
     * Checks a year according to the Gregorian leap-year rules.
     *
     * @param year the year to check
     * @return {@code true} if the year is a leap year; otherwise {@code false}
     */
    public boolean determine(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
