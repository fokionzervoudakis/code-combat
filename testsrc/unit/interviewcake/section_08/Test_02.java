package interviewcake.section_08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static interviewcake.section_08.Problem_02.Node;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_02 {
    private Problem_02 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_02();
    }

    @Test
    void itReturnsFalseWhenTheListDoesNotHaveACycle() {
        var hed = new Node(1);
        append(hed, 2);
        append(hed, 3);
        append(hed, 4);
        assertFalse(P.containsCycle(hed));
    }

    @Test
    void itReturnsTrueWhenTheTailCyclesToTheHeadNode() {
        var hed = new Node(1);
        append(hed, 2);
        append(hed, 3);
        var n = append(hed, 4);
        n.next = hed;
        assertTrue(P.containsCycle(hed));
    }

    @Test
    void itReturnsTrueWhenTheTailCyclesToTheThirdNode() {
        var hed = new Node(1);
        append(hed, 2);
        var n3 = append(hed, 3);
        append(hed, 4);
        var n5 = append(hed, 5);
        n5.next = n3;
        assertTrue(P.containsCycle(hed));
    }

    @Test
    void itReturnsTrueWhenTheTailCyclesToTheFourthNode() {
        var hed = new Node(1);
        append(hed, 2);
        append(hed, 3);
        var n4 = append(hed, 4);
        var n5 = append(hed, 5);
        n5.next = n4;
        assertTrue(P.containsCycle(hed));
    }

    @Test
    void itReturnsFalseWithoutAList() {
        assertFalse(P.containsCycle(null));
    }

    @Test
    void itReturnsFalseWhenASingleListNodeDoesNotHaveACycle() {
        assertFalse(P.containsCycle(new Node(1)));
    }

    @Test
    void itReturnsTrueWhenASingleListNodeHasACycle() {
        var hed = new Node(1);
        hed.next = hed;
        assertTrue(P.containsCycle(hed));
    }

    private Node append(Node n, int val) {
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node(val);
        return n.next;
    }
}
