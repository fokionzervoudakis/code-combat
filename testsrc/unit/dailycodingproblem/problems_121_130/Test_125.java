package dailycodingproblem.problems_121_130;

import dailycodingproblem.problems_121_130.Problem_125.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_125 {
    @Test
    void pruneTest() {
        var N = new Node(10);

        N.l = new Node(5);
        N.r = new Node(15);

        N.r.l = new Node(11);
        N.r.r = new Node(15);

        var expected = "[5, 15]";
        var actual = new Problem_125().preOrder(N, 20).toString();

        assertEquals(expected, actual);
    }
}
