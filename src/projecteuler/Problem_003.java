package projecteuler;

/**
 * Problem 3 - largest prime factor
 */
class Problem_003 {
    long maxPrime(long l) {
        int i;
        for (i = 2; i <= l; i++) {
            if (l % i == 0) {
                l /= i--;
            }
        }
        return i;
    }
}
