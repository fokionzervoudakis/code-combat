package csdojo;

class SumTo {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(2^n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of integers
     @param k an amount
     @return the number of subsets with integers that sum to {@code k}
     */
    int countSets(int[] A, int k) {
        return helper(A, 0, k);
    }

    private int helper(int[] A, int i, int k) {
        if (k == 0) {
            return 1;
        } else if (i == A.length) {
            return 0;
        } else {
            int a = helper(A, i + 1, k);
            int b = (k >= A[i]) ? helper(A, i + 1, k - A[i]) : 0;
            return a + b;
        }
    }
}
