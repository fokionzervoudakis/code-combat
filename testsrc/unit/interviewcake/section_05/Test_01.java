package interviewcake.section_05;

import interviewcake.section_05.Problem_01.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_01 {
    private Problem_01 P;
    private Node root;

    @BeforeEach
    void beforeEach() {
        P = new Problem_01();
        root = new Node();
    }

    @Test
    void itReturnsTrueWhenTheTreeHasOneNode() {
        assertTrue(P.isBalanced(new Node()));
    }

    @Test
    void itReturnsTrueWhenTheTreeIsBalanced() {
        root.l = new Node();
        root.l.l = new Node();
        root.l.r = new Node();

        root.r = new Node();
        root.r.l = new Node();
        root.r.r = new Node();

        assertTrue(P.isBalanced(root));
    }

    @Test
    void itReturnsTrueWhenSubtreeHeightsDifferByOne() {
        root.l = new Node();
        root.r = new Node();

        root.r.r = new Node();

        assertTrue(P.isBalanced(root));
    }

    @Test
    void itReturnsFalseWhenSubtreeHeightsDifferByTwo() {
        root.l = new Node();
        root.r = new Node();

        root.r.r = new Node();
        root.r.r.r = new Node();

        assertFalse(P.isBalanced(root));
    }

    @Test
    void itReturnsFalseWithBalancedSubtreesAndUnbalancedRoot() {
        root.l = new Node();
        root.r = new Node();

        root.r.l = new Node();
        root.r.l.l = new Node();

        root.r.r = new Node();

        assertTrue(P.isBalanced(root.l));
        assertTrue(P.isBalanced(root.r));

        assertFalse(P.isBalanced(root));
    }

    @Test
    void itReturnsFalseWhenTheTreeIsRightHeavy() {
        root.r = new Node();
        root.r.r = new Node();
        root.r.r.r = new Node();
        assertFalse(P.isBalanced(root));
    }
}
