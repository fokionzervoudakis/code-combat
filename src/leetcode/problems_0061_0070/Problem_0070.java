package leetcode.problems_0061_0070;

class Problem_0070 {
    int climbStairs(int n) {
        int a = 0, b = 1, c;
        for (int i = 0; i < n + 1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
