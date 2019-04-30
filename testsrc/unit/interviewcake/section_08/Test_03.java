package interviewcake.section_08;

import interviewcake.section_08.Problem_03.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_03 {
    private Problem_03 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_03();
    }

    @Test
    void itReversesAShortList() {
        var hed = new Node(1);
        append(hed, 2);
        var expected = "[2] -> [1] -> null";
        var actual = P.reverseList(hed).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReversesALongList() {
        var hed = new Node(1);
        append(hed, 2);
        append(hed, 3);
        append(hed, 4);
        append(hed, 5);
        append(hed, 6);
        var expected = "[6] -> [5] -> [4] -> [3] -> [2] -> [1] -> null";
        var actual = P.reverseList(hed).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReversesOneNode() {
        var expected = "[1] -> null";
        var actual = P.reverseList(new Node(1)).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReversesZeroNodes() {
        assertNull(P.reverseList(null));
    }

    private void append(Node n, int val) {
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node(val);
    }
}
