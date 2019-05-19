package interviewcake.section_07;

import java.util.Stack;

/**
 <p>{@link dailycodingproblem.problems_041_050.Problem_043}
 <p>{@link leetcode.problems_0151_0160.Problem_0155}
 */
public class Problem_01 {
    /**
     Asymptotic analysis:
     <li>space_worst=O(n)
     <li>push_worst=O(1)
     <li>pop_worst=O(1)
     <li>getMax_worst=O(1)
     */
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
