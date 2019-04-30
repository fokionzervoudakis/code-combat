package interviewcake.section_08;

import interviewcake.section_08.Problem_01.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Test_01 {
    private Problem_01 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_01();
    }

    @Test
    void itDeletesTheFirstNode() {
        var hed = new Node(1);
        append(hed, 2);
        append(hed, 3);
        append(hed, 4);
        P.deleteNode(hed);
        assertEquals("[2] -> [3] -> [4] -> null", hed.toString());
    }

    @Test
    void itDeletesANodeInTheMiddleOfTheList() {
        var hed = new Node(1);
        var n = append(hed, 2);
        append(hed, 3);
        append(hed, 4);
        P.deleteNode(n);
        assertEquals("[1] -> [3] -> [4] -> null", hed.toString());
    }

    @Test
    void itFailsToDeleteTheLastNode() {
        try {
            var hed = new Node(1);
            append(hed, 2);
            append(hed, 3);
            var n = append(hed, 4);
            P.deleteNode(n);
            fail(new Throwable());
        } catch (NullPointerException ignored) {
        }
    }

    @Test
    void itFailsToDeleteASingleNode() {
        try {
            P.deleteNode(new Node(1));
            fail(new Throwable());
        } catch (NullPointerException ignored) {
        }
    }

    private Node append(Node n, int val) {
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node(val);
        return n.next;
    }
}
