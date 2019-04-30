package interviewcake.section_06;

class Problem_02 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param n a number
     @return the {@code n}th Fibonacci number
     */
    int fib(int n) {
        if (n < 0) {
            throw new RuntimeException();
        }
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
