package interviewcake.section_07;

import java.util.Stack;

/**
 {@link dailycodingproblem.problems_041_050.Problem_043}
 */
public class Problem_01 {
    class MaxStack {
        private final Stack<Integer> stack = new Stack<>();
        private final Stack<Integer> max = new Stack<>();

        void push(int n) {
            stack.push(n);
            if (max.isEmpty() || n >= max.peek()) {
                max.push(n);
            }
        }

        int pop() {
            int n = stack.pop();
            if (n == max.peek()) {
                max.pop();
            }
            return n;
        }

        int getMax() {
            return max.peek();
        }
    }
}
