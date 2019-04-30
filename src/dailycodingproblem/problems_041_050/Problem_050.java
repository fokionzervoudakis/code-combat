package dailycodingproblem.problems_041_050;

/**
 Problem #50 [Easy] - Microsoft
 */
class Problem_050 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_avg=O(log n)
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param n the root of a binary tree
     @return the result of evaluating the arithmetic expression in {@code n}
     */
    int eval(Node n) {
        var c = n.val;
        if (c >= '0' && c <= '9') {
            return c -'0';
        } else {
            int l = eval(n.l), r = eval(n.r);
            return switch (c) {
                case '*' -> l * r;
                case '+' -> l + r;
                case '-' -> l - r;
                case '/' -> l / r;
                default -> throw new RuntimeException();
            };
        }
    }

    static class Node {
        char val;
        Node l, r;

        Node(char val) {
            this.val = val;
        }
    }
}
