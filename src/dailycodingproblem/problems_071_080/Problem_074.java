package dailycodingproblem.problems_071_080;

/**
 Problem #74 [Medium] - Apple
 */
class Problem_074 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(1)
     </ul>

     @param n the height and width of a multiplication table
     @param x a target number
     @return the number of times {@code x} appears in an {@code n} by {@code n}
     table
     */
    int getProdCount1(int n, int x) {
        int sum = 0;
        for (int i = 0; i < n; i++) { // O(n)
            for (int j = 0; j < n; j++) { // O(n)
                if ((i + 1) * (j + 1) == x) {
                    sum++;
                }
            }
        }
        return sum;
    }

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(1)
     </ul>

     @param n the height and width of a multiplication table
     @param x a target number
     @return the number of times {@code x} appears in an {@code n} by {@code n}
     table
     */
    int getProdCount2(int n, int x) {
        if (n == 1) {
            return n;
        }
        int sum = 0;
        for (int i = 1; i < n; i++) { // O(n)
            if (x % i == 0) {
                sum++;
            }
        }
        return sum;
    }
}
