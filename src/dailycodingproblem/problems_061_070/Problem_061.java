package dailycodingproblem.problems_061_070;

/**
 Problem #61 [Medium] - Google
 */
class Problem_061 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(log n)
     <li>space_worst=O(1)
     </ul>

     @param a the base
     @param b the exponent
     @return the value of {@code a}^{@code b}
     */
    int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        int pow = power(a, b / 2);
        return (b % 2 == 0) ? pow * pow : a * pow * pow;
    }
}
