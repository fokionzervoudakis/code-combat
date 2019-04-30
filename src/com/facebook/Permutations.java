package com.facebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Permutations {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(n)
     </ul>

     @param s a small string
     @param b a big string
     @return permutations of {@code s} in {@code b}
     */
    List<String> getPermutations(String s, String b) {
        var L = new ArrayList<String>();
        for (var i = 0; i < b.length() - s.length(); i++) {
            var sub = b.substring(i, i + s.length());
            if (isPermutation(s, sub)) {
                L.add(sub);
            }
        }
        return L;
    }

    private boolean isPermutation(String s1, String s2) {
        var M = new HashMap<Character, Integer>();
        for (var c : s1.toCharArray()) {
            M.put(c, M.containsKey(c) ? (M.get(c) + 1) : 1);
        }
        for (var c : s2.toCharArray()) {
            if (M.containsKey(c)) {
                int n = M.get(c);
                if (n == 1) {
                    M.remove(c);
                } else {
                    M.put(c, n - 1);
                }
            } else {
                return false;
            }
        }
        return M.isEmpty();
    }
}
