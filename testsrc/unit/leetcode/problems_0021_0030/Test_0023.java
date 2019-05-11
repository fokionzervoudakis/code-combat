package leetcode.problems_0021_0030;

import leetcode.problems_0021_0030.Problem_0023.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_0023 {
    private Problem_0023 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0023();
    }

    @Test
    void itMergesThreeSortedLinkedLists() {
        var N1 = new Node(1);
        N1.next = new Node(4);
        N1.next.next = new Node(5);

        var N2 = new Node(1);
        N2.next = new Node(3);
        N2.next.next = new Node(4);

        var N3 = new Node(2);
        N3.next = new Node(6);

        var expected = "[1] -> [1] -> [2] -> [3] -> [4] -> [4] -> [5] -> [6] -> null";
        var actual = P.mergeKLists(new Node[] { N1, N2, N3 }).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsNullWhenTheArrayIsEmpty() {
        assertNull(P.mergeKLists(new Node[0]));
    }
}
