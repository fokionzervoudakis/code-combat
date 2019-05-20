package leetcode.problems_0241_0250;

import java.util.Arrays;

class Problem_0242 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n log n)
     <li>space_worst=O(n)
     </ul>

     @param s1 a string
     @param s2 another string
     @return true if {@code s1} and {@code s2} are anagrams, else false
     */
    boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] A = s1.toCharArray();
        char[] B = s2.toCharArray();
        Arrays.sort(A); // O(n log n)
        Arrays.sort(B); // O(n log n)
        for (int i = 0; i < A.length; i++) { // O(n)
            if (A[i] != B[i]) {
                return false;
            }
        }
        return true;
    }
}
