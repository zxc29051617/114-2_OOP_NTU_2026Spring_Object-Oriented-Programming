public class GreenCrud {
    public int calPopulation(int initialSize, int days) {
        int n = days / 5;

        if (n <= 1) {
            return initialSize;
        }

        int a = initialSize; // F1
        int b = initialSize; // F2

        for (int i = 2; i < n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }
}