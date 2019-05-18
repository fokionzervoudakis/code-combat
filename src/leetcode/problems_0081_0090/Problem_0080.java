package leetcode.problems_0081_0090;

import annotation.InPlace;

class Problem_0080 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A a sorted integer array
     @return the length of {@code A} with max two occurrences per duplicate
     element
     */
    @InPlace
    int removeDuplicates(int[] A) {
        int i = 0;
        for (int n : A) {
            if (i < 2 || n > A[i - 2]) {
                A[i++] = n;
            }
        }
        return i;
    }
}
