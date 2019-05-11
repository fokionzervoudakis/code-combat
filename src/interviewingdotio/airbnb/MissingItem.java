package interviewingdotio.airbnb;

import annotation.Bitwise;
import annotation.pattern.HashTable;

import java.util.ArrayList;
import java.util.HashSet;

/**
 Links:
 <ul>
 <li>{@link interviewcake.section_11.Problem_01}
 <li>{@link leetcode.problems_0131_0140.Problem_0136}
 </ul>
 <p>https://interviewing.io/recordings/Python-Airbnb-4/
 <p>https://interviewing.io/recordings/C++-Airbnb-2
 */
public class MissingItem {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of unique elements
     @param B another array of unique elements
     @return the element in {@code A} that is missing from {@code B}
     */
    @HashTable
    int naive(int[] A, int[] B) {
        var S = new HashSet<Integer>();
        for (var n : A) S.add(n);
        for (var n : B) S.remove(n);
        return new ArrayList<>(S).get(0);
    }

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of unique elements
     @param B another array of unique elements
     @return the element in {@code A} that is missing from {@code B}
     */
    int optimized(int[] A, int[] B) {
        var m = 0;
        for (var n : A) m += n;
        for (var n : B) m -= n;
        return m;
    }

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of unique elements
     @param B another array of unique elements
     @return the element in {@code A} that is missing from {@code B}
     */
    @Bitwise
    public int optimizedWithXor(int[] A, int[] B) {
        var m = 0;
        // Use XOR to guarantee O(1) space for overflowing operations.
        // Note: some languages (such as Python) will automatically promote
        // overflowing numbers to support arbitrary-precision arithmetic (see
        // https://github.com/python/peps/blob/master/pep-0237.txt).
        for (var n : A) m ^= n;
        for (var n : B) m ^= n;
        return m;
    }
}
