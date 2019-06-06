package leetcode.problems_1011_1020;

class Problem_1013 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an integer array
     @return true if {@code A} can be partitioned into three non-empty parts with
     equal sums, else false
     */
    boolean canThreePartsEqualSum(int[] A) {
        int gSum = 0;
        for (int m : A) { // O(n)
            gSum += m;
        }
        if (A.length < 3 || gSum % 3 != 0) {
            return false;
        }
        gSum /= 3;
        int lSum = 0, n = 0;
        for (int m : A) { // O(n)
            if ((lSum += m) == gSum) {
                lSum = 0;
                if (++n == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
