package dailycodingproblem.problems_131_140;

/**
 Problem #137 [Medium] - Amazon
 */
class Problem_137 {
    static class BitArray {
        byte[] A;

        BitArray(int n) {
            A = new byte[n];
        }

        void set(int i, int val) {
            A[i] = (byte) val;
        }

        byte get(int i) {
            return A[i];
        }
    }
}
