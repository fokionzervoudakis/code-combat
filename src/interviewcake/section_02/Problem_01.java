package interviewcake.section_02;

import annotation.Pattern;
import annotation.Pattern.Type;

import java.util.HashSet;
import java.util.Set;

class Problem_01 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of integers
     @param n a target integer
     @return true if {@code n} is the sum of two numbers in {@code A}, else false
     */
    @Pattern(Type.HASH_TABLE)
    boolean canTwoMoviesFillFlight(int[] A, int n) {
        Set<Integer> S = new HashSet<>();
        for (int a : A) { // O(n)
            int b = n - a;
            if (S.contains(b)) { // O(1)
                return true;
            } else {
                S.add(a); // O(1)
            }
        }
        return false;
    }
}
