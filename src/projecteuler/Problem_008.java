package projecteuler;

/**
 * Problem 8 - largest product in a series
 */
class Problem_008 {
    long maxProduct(String S, int n) {
        long a = 0;
        for (int i = 0; i < S.length() - n; i++) {
            long b = 1;
            for (int j = 0; j < n; j++) {
                b *= S.charAt(i + j) - '0';
            }
            a = Math.max(a, b);
        }
        return a;
    }
}
