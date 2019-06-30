package dailycodingproblem.problems_101_110;

import dailycodingproblem.problems_101_110.Problem_110.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_110 {
    @Test
    void getPathsTest() {
        var root = new Node(1);

        root.l = new Node(2);
        root.r = new Node(3);

        root.r.l = new Node(4);
        root.r.r = new Node(5);

        var expected = "[[1, 2], [1, 3, 4], [1, 3, 5]]";
        var actual = new Problem_110().getPaths(root).toString();

        assertEquals(expected, actual);
    }
}
