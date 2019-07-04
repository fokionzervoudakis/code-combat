package dailycodingproblem.problems_111_120;

import dailycodingproblem.problems_111_120.Problem_115.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_115 {
    private Problem_115 P;
    private Node S;

    @BeforeEach
    void beforeEach() {
        P = new Problem_115();
        S = new Node(0);
        S.l = new Node(1);
        S.r = new Node(2);
        S.r.l = new Node(3);
        S.r.r = new Node(4);
    }

    @Test
    void itReturnsTrueIfTwoTreesOverlap() {
        var T = new Node(2);
        T.l = new Node(3);
        T.r = new Node(4);
        assertTrue(P.isSubtree(S, T));
    }

    @Test
    void itReturnsFalseIfTwoTreesDoNotOverlap() {
        var T = new Node(2);
        T.l = new Node(3);
        T.r = new Node(5);
        assertFalse(P.isSubtree(S, T));
    }
}
