package projecteuler;

/**
 * Problem 6 - sum square difference
 */
class Problem_006 {
    int diff(int n) {
        int a = 0, b = 0;
        for (int i = 1; i <= n; i++) {
            a += i;
            b += i * i;
        }
        return (a * a) - b;
    }
}
