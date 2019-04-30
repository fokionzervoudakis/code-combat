package dailycodingproblem.problems_021_030;

import dailycodingproblem.problems_021_030.Problem_026.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_026 {
    private Problem_026 P;
    private Node hed;

    @BeforeEach
    void beforeEach() {
        P = new Problem_026();
        hed = new Node(1);
        append(hed, 2);
        append(hed, 3);
        append(hed, 4);
    }

    @Test
    void itRemovesTheSecondToLastNode() {
        P.removeKthElement(hed, 2);
        var expected = "[1] -> [2] -> [4] -> null";
        var actual = hed.toString();
        assertEquals(expected, actual);
    }

    @Test
    void itRemovesTheThirdToLastNode() {
        P.removeKthElement(hed, 3);
        var expected = "[1] -> [3] -> [4] -> null";
        var actual = hed.toString();
        assertEquals(expected, actual);
    }

    @Test
    void itRemovesTheFourthToLastNode() {
        P.removeKthElement(hed, 4);
        var expected = "[2] -> [3] -> [4] -> null";
        var actual = hed.toString();
        assertEquals(expected, actual);
    }

    private void append(Node n, int val) {
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node(val);
    }
}
