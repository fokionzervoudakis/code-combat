package dailycodingproblem.problems_081_090;

/**
 Problem #85 [Medium] - Facebook
 */
class Problem_085 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(1)
     <li>space_worst=O(1)
     </ul>

     @param x a number
     @param y another number
     @param b a number that is either zero or one
     @return {@code x} if {@code b} is one and {@code y} if {@code b} is zero
     */
    int getNum(int x, int y, int b) {
        return x * b + y * (b ^ 1);
    }
}
