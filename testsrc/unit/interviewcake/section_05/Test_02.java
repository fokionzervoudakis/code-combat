package interviewcake.section_05;

import interviewcake.section_05.Problem_02.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_02 {
    private Problem_02 P;
    private Node root;

    @BeforeEach
    void beforeEach() {
        P = new Problem_02();
        root = new Node(50);
    }

    @Test
    void itReturnsTrueWhenTheTreeHasOneNode() {
        assertTrue(P.isBst(root));
    }

    @Test
    void itReturnsTrueWhenTheTreeIsABst() {
        root.l = new Node(30);
        root.l.l = new Node(10);
        root.l.r = new Node(40);

        root.r = new Node(70);
        root.r.l = new Node(60);
        root.r.r = new Node(80);

        assertTrue(P.isBst(root));
    }

    @Test
    void itReturnsFalseWhenTheSubtreesAreBinarySearchTreesButTheRootIsNotABst() {
        root.l = new Node(30);
        root.l.l = new Node(20);
        root.l.r = new Node(60);

        root.r = new Node(80);
        root.r.l = new Node(70);
        root.r.r = new Node(90);

        assertFalse(P.isBst(root));
    }

    @Test
    void itReturnsTrueWhenALeftHeavyTreeIsABst() {
        root.l = new Node(40);
        root.l.l = new Node(30);
        root.l.l.l = new Node(20);
        root.l.l.l.l = new Node(10);
        assertTrue(P.isBst(root));
    }

    @Test
    void itReturnsFalseWhenARightHeavyTreeIsNotABst() {
        root.r = new Node(70);
        root.r.r = new Node(60);
        root.r.r.r = new Node(80);
        assertFalse(P.isBst(root));
    }

    @Test
    void itReturnsFalseWhenTheLeftNodeIsEqualToTheParentNode() {
        root.l = new Node(50);
        assertFalse(P.isBst(root));
    }

    @Test
    void itReturnsFalseWhenTheRightNodeIsEqualToTheParentNode() {
        root.r = new Node(50);
        assertFalse(P.isBst(root));
    }
}
