package interviewcake.section_06;

class Problem_03 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(2^n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of coin denominations
     @param k an amount of money
     @return the number of ways to make {@code k} with coins in {@code A}
     */
    int makeChange(int[] A, int k) {
        return helper(A, 0, k);
    }

    private int helper(int[] A, int i, int k) {
        if (i == A.length && k >= 1) {
            return 0;
        } else if (k == 0) {
            return 1;
        } else {
            int a = helper(A, i + 1, k);
            int b = (k >= A[i]) ? helper(A, i, k - A[i]) : 0;
            return a + b;
        }
    }
}
