import java.util.*;

/**
 * Provides operations for removing and replacing words in a sentence.
 */
public class SentenceProcessor {

    /**
     * Creates a sentence processor.
     */
    public SentenceProcessor() {
    }

    /**
     * Removes repeated words while preserving their first occurrence.
     *
     * @param sentence the sentence to process
     * @return the sentence without duplicated words
     */
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

    /**
     * Replaces every exact occurrence of a target word.
     *
     * @param target the word to replace
     * @param replacement the replacement word
     * @param sentence the sentence to process
     * @return the sentence after replacement
     */
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
