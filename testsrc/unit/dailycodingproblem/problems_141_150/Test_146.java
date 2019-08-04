package dailycodingproblem.problems_141_150;

import dailycodingproblem.problems_141_150.Problem_146.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_146 {
    @Test
    void pruneTest() {
        var N = new Node(0);

        N.l = new Node(1);
        N.r = new Node(0);

        N.r.l = new Node(1);
        N.r.r = new Node(0);

        N.r.l.l = new Node(0);
        N.r.l.r = new Node(0);

        new Problem_146().prune(N);

        var expected = "((null 1 null) 0 ((null 1 null) 0 null))";
        var actual = N.toString();

        assertEquals(expected, actual);
    }
}
