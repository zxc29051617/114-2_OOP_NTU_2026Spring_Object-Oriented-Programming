/**
 * Calculates the population growth of green crud.
 */
public class GreenCrud {

    /**
     * Creates a green-crud population calculator.
     */
    public GreenCrud() {
    }

    /**
     * Calculates the population after the specified number of days.
     *
     * @param initialSize the initial population
     * @param days the number of elapsed days
     * @return the population after the elapsed time
     */
    public int calPopulation(int initialSize, int days) {
        int n = days / 5 + 1;

        if (n <= 2) {
            return initialSize;
        }

        int a = initialSize; // F1
        int b = initialSize; // F2

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }
}
