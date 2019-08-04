package dailycodingproblem.problems_141_150;

import dailycodingproblem.problems_141_150.Problem_145.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_145 {
    @Test
    void swapTwoTest() {
        var N = new Node(1);
        N.next = new Node(2);
        N.next.next = new Node(3);
        N.next.next.next = new Node(4);

        var expected = "2 -> 1 -> 4 -> 3 -> null";
        var actual = new Problem_145().swapTwo(N).toString();

        assertEquals(expected, actual);
    }
}
