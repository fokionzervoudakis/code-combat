package projecteuler;

/**
 * Problem 10 - summation of primes
 */
class Problem_010 {
    long primeSum(int n) {
        boolean[] A = sieveOfEratosthenes(n);
        long sum = 0;
        for (int i = 2; i < n; i++) {
            if (A[i]) {
                sum += i;
            }
        }
        return sum;
    }

    boolean[] sieveOfEratosthenes(int n) {
        boolean[] A = new boolean[n];
        for (int i = 0; i < n; i++) {
            A[i] = true;
        }
        // To find all prime numbers up to N:
        for (int i = 2; i * i < n; i++) {
            // if a number is a prime,
            if (A[i]) {
                // then multiples of that number...
                for (int j = i * i; j < n; j += i) {
                    // are not primes.
                    A[j] = false;
                }
            }
        }
        return A;
    }
}
