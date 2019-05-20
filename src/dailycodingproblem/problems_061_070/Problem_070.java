package dailycodingproblem.problems_061_070;

/**
 Problem #70 [Easy] - Microsoft
 */
class Problem_070 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(1)
     <li>space_worst=O(1)
     </ul>

     @param n a positive integer
     @return the {@code n}-th perfect number (i.e. the {@code n}-th number with
     digits that sum up to 10)
     */
    long getNthPerfect(int n) {
        var exp = (n / 10) + 1;
        var l = (long) Math.pow(10, exp);
        var mod = n % 10;
        return (mod == 0) ? l : (mod * l) + (10 - mod);
    }
}
