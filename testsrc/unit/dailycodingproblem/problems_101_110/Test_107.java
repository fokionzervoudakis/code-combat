package dailycodingproblem.problems_101_110;

import dailycodingproblem.problems_101_110.Problem_107.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_107 {
    @Test
    void itTraversesABinaryTree() {
        var N = new Node(1);

        N.l = new Node(2);
        N.r = new Node(3);

        N.r.l = new Node(4);
        N.r.r = new Node(5);

        var expected = "[1, 2, 3, 4, 5]";
        var actual = new Problem_107().preOrder(N).toString();

        assertEquals(expected, actual);
    }
}
