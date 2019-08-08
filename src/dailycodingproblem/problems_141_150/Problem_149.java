package dailycodingproblem.problems_141_150;

/**
 Problem #149 [Hard] - Goldman Sachs
 */
class Problem_149 {
    int sum(int[] A, int l, int r) {
        int[] B = new int[A.length];
        B[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            B[i] = A[i] + B[i - 1];
        }
        return B[r - 1] - B[l - 1];
    }
}
