package leetcode.problems_0021_0030;

/**
 {@link dailycodingproblem.problems_081_090.Problem_088}
 */
public class Problem_0029 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param a the dividend
     @param b the divisor
     @return the quotient of {@code a / b}
     */
    int divide(int a, int b) {
        boolean neg = (a < 0 && b > 0) || (a > 0 && b < 0);
        int q = 0;
        a = Math.abs(a);
        b = Math.abs(b);
        while (a >= b) {
            a -= b;
            q++;
        }
        return (neg) ? -q : q;
    }
}
