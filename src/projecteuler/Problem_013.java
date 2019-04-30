package projecteuler;

import java.math.BigInteger;
import java.util.List;

/**
 * Problem 13 - large sum
 */
class Problem_013 {
    String firstTen(List<String> L) {
        var big = BigInteger.ZERO;
        for (var s : L) {
            big = big.add(new BigInteger(s));
        }
        return big.toString().substring(0, 10);
    }
}
