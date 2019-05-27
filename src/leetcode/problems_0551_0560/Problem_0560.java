package leetcode.problems_0551_0560;

class Problem_0560 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(1)
     </ul>

     @param A an integer array
     @param k a target sum
     @return the number of continuous sub-arrays of {@code A} with sum {@code k}
     */
    int subArraySum(int[] A, int k) {
        int n = 0;
        for (int i = 0; i < A.length; i++) { // O(n)
            int sum = 0;
            for (int j = i; j < A.length; j++) { // O(n)
                sum += A[j];
                if (sum == k) {
                    n++;
                }
            }
        }
        return n;
    }
}
