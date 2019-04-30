package projecteuler;

/**
 * Problem 2 - even Fibonacci numbers
 */
class Problem_002 {
    int evenFib(int n) {
        int a = 0, b = 1, sum = 0;
        while (a < n) {
            int c = a + b;
            a = b;
            b = c;
            if (a % 2 == 0) {
                sum += a;
            }
        }
        return sum;
    }
}
