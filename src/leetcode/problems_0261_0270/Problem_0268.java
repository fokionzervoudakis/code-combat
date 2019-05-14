package leetcode.problems_0261_0270;

class Problem_0268 {
    /**
     Calculates the triangular number to find the number missing from an array of
     distinct integers.
     <p>Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of {@code n} distinct integers from {@code [0, n]}
     @return the integer missing from {@code A}
     */
    int missingNumber(int[] A) {
        int m = A.length, sum = ((m * m) + m) / 2;
        for (int n : A) {
            sum -= n;
        }
        return sum;
    }
}
