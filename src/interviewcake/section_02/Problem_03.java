package interviewcake.section_02;

import annotation.Pattern;
import annotation.Pattern.Type;

import java.util.LinkedHashMap;
import java.util.Map;

class Problem_03 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param str a string
     @return a map that associates each word in {@code str} with the number of
     times that word has occurred
     */
    @Pattern(Type.HASH_TABLE)
    Map<String, Integer> countWords(String str) {
        Map<String, Integer> M = new LinkedHashMap<>(); // Order for test determinism.
        for (String word : cleanup(str).split(" ")) { // O(n)
            String cap, low;
            if (M.containsKey(word)) { // O(1)
                M.put(word, M.get(word) + 1); // O(1)
            } else if (M.containsKey(cap = capitalize(word))) { // O(n)
                M.put(word, M.get(cap) + 1); // O(1)
                M.remove(cap); // O(1)
            } else if (M.containsKey(low = word.toLowerCase())) { // O(n)
                M.put(low, M.get(low) + 1); // O(1)
            } else {
                M.put(word, 1); // O(1)
            }
        }
        return M;
    }

    private String cleanup(String str) {
        return str.replaceAll("\\.{3}", " ") // O(n)
                .replaceAll(" - ", " ") // O(n)
                .replaceAll("[^ '\\-0-9A-Za-z]", ""); // O(n)
    }

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1); // O(n)
    }
}
