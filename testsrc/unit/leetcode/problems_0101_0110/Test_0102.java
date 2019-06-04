package leetcode.problems_0101_0110;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static leetcode.problems_0101_0110.Problem_0102.Node;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0102 {
    private Problem_0102 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0102();
    }

    @Test
    void itReturnsTheLevelOrderOfZeroNodes() {
        var expected = "[]";
        var actual = P.levelOrder(null).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsTheLevelOrderOfManyNodes() {
        var N = new Node(3);

        N.l = new Node(9);
        N.r = new Node(20);

        N.r.l = new Node(15);
        N.r.r = new Node(7);

        var expected = "[[3], [9, 20], [15, 7]]";
        var actual = P.levelOrder(N).toString();

        assertEquals(expected, actual);
    }
}
