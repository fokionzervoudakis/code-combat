package projecteuler;

import java.math.BigInteger;

/**
 * Problem 16 - power digit sum
 */
class Problem_016 {
    int sum(int exp) {
        int sum = 0;
        for (char c : BigInteger.valueOf(2).pow(exp).toString().toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}
