package dailycodingproblem.problems_081_090;

/**
 Problem #88 [Medium] - ContextLogic
 */
class Problem_088 {
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
    int div(int a, int b) {
        if (b == 0) throw new ArithmeticException();
        int q = 0;
        while (a >= b) { // O(n)
            a -= b;
            q++;
        }
        return q;
    }
}
