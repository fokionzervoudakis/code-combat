package dailycodingproblem.problems_081_090;

import dailycodingproblem.problems_081_090.Problem_083.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_083 {
    @Test
    void itInvertsATree() {
        var N = new Node('a');

        N.l = new Node('b');
        N.r = new Node('c');

        N.l.l = new Node('d');
        N.l.r = new Node('e');

        N.r.l = new Node('f');

        var expected = "((null c (null f null)) a ((null e null) b (null d null)))";
        var actual = new Problem_083().invert(N).toString();

        assertEquals(expected, actual);
    }
}
