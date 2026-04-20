import java.util.*;

public class SentenceProcessor {

    public String removeDuplicatedWords(String sentence) {
        String[] words = sentence.split(" ");
        Set<String> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!seen.contains(word)) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(word);
                seen.add(word);
            }
        }

        return result.toString();
    }

    public String replaceWord(String target, String replacement, String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.equals(target)) {
                word = replacement;
            }

            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(word);
        }

        return result.toString();
    }
}