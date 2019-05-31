package leetcode.problems_0431_0440;

import leetcode.problems_0431_0440.Problem_0437.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0437 {
    private Problem_0437 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0437();
    }

    @Test
    void itCountsZeroPaths() {
        assertEquals(0, P.pathSum(null, 2));
        assertEquals(0, P.pathSum(new Node(1), 2));
    }

    @Test
    void itCountsOnePath() {
        assertEquals(1, P.pathSum(new Node(1), 1));
        assertEquals(1, P.pathSum(new Node(2), 2));
    }

    @Test
    void itCountsManyPaths() {
        var N = new Node(10);

        N.l = new Node(5);
        N.r = new Node(-3);

        N.l.l = new Node(3);
        N.l.r = new Node(2);

        N.l.l.l = new Node(3);
        N.l.l.r = new Node(-2);

        N.l.r.r = new Node(1);

        N.r.r = new Node(11);

        assertEquals(3, P.pathSum(N, 8));
    }
}
