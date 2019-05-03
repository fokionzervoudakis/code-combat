package interviewcake.section_02;

import annotation.pattern.HashTable;

import java.util.HashSet;
import java.util.Set;

class Problem_02 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param str a string
     @return true if any permutation of {@code str} is a palindrome, else false
     */
    @HashTable
    boolean hasPalindromePermutation(String str) {
        Set<Character> S = new HashSet<>();
        for (char c : str.toCharArray()) { // O(n)
            if (S.contains(c)) { // O(1)
                S.remove(c); // O(1)
            } else {
                S.add(c); // O(1)
            }
        }
        return S.size() <= 1;
    }
}
