package projecteuler;

/**
 * Problem 5 - smallest multiple
 */
class Problem_005 {
    long lcm(int n) {
        long a = 1, b = 2;
        while (b <= n) {
            a = lcm(a, b);
            b++;
        }
        return a;
    }

    long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    long gcd(long a, long b) {
        while (b != 0) {
            long n = b;
            b = a % b;
            a = n;
        }
        return a;
    }
}
