public class GreenCrud {
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