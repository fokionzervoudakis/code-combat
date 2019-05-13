package leetcode.problems_0161_0170;

class Problem_0169 {
    // TODO test and Javadoc
    int majorityElement(int[] A) {
        int i = 0;
        Integer m = null;
        for (int n : A) {
            if (i == 0) {
                m = n;
                i = 1;
            } else if (m == n) {
                i++;
            } else {
                i--;
            }
        }
        return m;
    }
}
