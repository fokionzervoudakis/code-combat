package csdojo;

class ClosestPair {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an ordered array of integers
     @param B a second ordered array of integers
     @param k a target
     @return two integers (one from {@code A} and one from {@code B}) whose sum
     is closest to {@code k}
     */
    int[] getClosest(int[] A, int[] B, int k) {
        int gMin = Integer.MAX_VALUE;

        int i = 0, j = B.length - 1;
        int m = 0, n = 0;

        while (i < A.length && j >= 0) { // O(n)
            int diff = A[i] + B[j] - k, lMin = Math.abs(diff);
            if (lMin < gMin) {
                gMin = lMin;
                m = A[i];
                n = B[j];
            }
            if (diff < 0) {
                i++;
            } else {
                j--;
            }
        }

        return new int[] { m, n };
    }
}
