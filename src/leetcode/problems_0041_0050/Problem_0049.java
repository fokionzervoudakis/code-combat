package leetcode.problems_0041_0050;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 {@link codekata.Problem_06}
 */
public class Problem_0049 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mn log n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of strings
     @return a list of grouped anagrams in {@code A}
     */
    List<List<String>> groupAnagrams(String[] A) {
        Map<String, List<String>> M = new LinkedHashMap<>(); // Order for test determinism.
        for (String str : A) { // O(m)
            char[] B = str.toCharArray();
            Arrays.sort(B); // O(n log n)
            String sorted = new String(B);
            if (!M.containsKey(sorted)) {
                M.put(sorted, new ArrayList<>());
            }
            M.get(sorted).add(str);
        }
        return new ArrayList<>(M.values());
    }
}
