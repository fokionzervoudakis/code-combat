package dailycodingproblem.problems_011_020;

import dailycodingproblem.problems_011_020.Problem_020.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_020 {
    private Problem_020 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_020();
    }

    @Test
    void itReturnsNullWhenOneOfTheListsIsNull() {
        assertNull(P.intersection(null, null));
        assertNull(P.intersection(null, new Node(0)));
        assertNull(P.intersection(new Node(0), null));
    }

    @Test
    void itReturnsNullWhenTheListsDoNotIntersect() {
        assertNull(P.intersection(new Node(0), new Node(1)));
    }

    @Test
    void itReturnsTheIntersectingNode() {
        var A1 = new Node(3);
        var A2 = new Node(7);
        var A3 = new Node(8);
        var A4 = new Node(10);

        A1.next = A2;
        A2.next = A3;
        A3.next = A4;

        var B1 = new Node(99);
        var B2 = new Node(1);

        B1.next = B2;
        B2.next = A3;

        assertEquals(A3, P.intersection(A1, B1));
    }
}
