import java.util.HashMap;
import java.util.Map;

public class CardMatchingGame {

    public static String process(String[] commands) {
        // Use HashMap to store: Card Number -> Quantity
        HashMap<Integer, Integer> table = new HashMap<>();
        StringBuilder output = new StringBuilder();
        int totalCount = 0;

        for (String cmdLine : commands) {
            String[] parts = cmdLine.split(" ");
            String action = parts[0];

            switch (action) {
                case "add": {
                    int n = Integer.parseInt(parts[1]);
                    table.put(n, table.getOrDefault(n, 0) + 1);
                    totalCount++;
                    break;
                }
                case "remove": {
                    int n = Integer.parseInt(parts[1]);
                    if (!table.containsKey(n) || table.get(n) == 0) {
                        output.append("Card not found\n");
                    } else {
                        int currentCount = table.get(n);
                        if (currentCount == 1) {
                            table.remove(n);
                        } else {
                            table.put(n, currentCount - 1);
                        }
                        totalCount--;
                    }
                    break;
                }
                case "check": {
                    int n = Integer.parseInt(parts[1]);
                    boolean exists = table.containsKey(n) && table.get(n) > 0;
                    output.append(exists ? "true\n" : "false\n");
                    break;
                }
                case "count": {
                    output.append(totalCount).append("\n");
                    break;
                }
                case "pair": {
                    int totalPairs = 0;
                    // Iterate through the counts of each unique card
                    for (int count : table.values()) {
                        totalPairs += count / 2;
                    }
                    output.append(totalPairs).append("\n");
                    break;
                }
            }
        }
        
        // Remove the last newline character before returning
        return output.toString().trim();
    }
}