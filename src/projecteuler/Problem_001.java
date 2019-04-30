package projecteuler;

/**
 * Problem 1 - multiples of 3 and 5
 */
class Problem_001 {
    int multiples(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
