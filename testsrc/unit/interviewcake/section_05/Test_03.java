package interviewcake.section_05;

import interviewcake.section_05.Problem_03.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Test_03 {
    private Problem_03 P;
    private Node root;

    @BeforeEach
    void beforeEach() {
        P = new Problem_03();
        root = new Node(50);
    }

    @Test
    void itReturnsTheRootValueWhenTheRightSubtreeHasZeroChildren_balanced() {
        root.l = new Node(30);
        root.l.l = new Node(10);
        root.l.r = new Node(40);

        root.r = new Node(70);
        root.r.l = new Node(60);
        root.r.r = new Node(80);

        assertEquals(70, P.findSecondLargest(root));
    }

    @Test
    void itReturnsTheRootValueWhenTheRightSubtreeHasZeroChildren_rightHeavy() {
        root.l = new Node(30);
        root.l.l = new Node(10);
        root.l.r = new Node(40);

        root.r = new Node(70);

        assertEquals(50, P.findSecondLargest(root));
    }

    @Test
    void itReturnsTheRootValueWhenTheRightSubtreeHasZeroChildren_unbalanced() {
        root.r = new Node(60);
        root.r.r = new Node(70);
        root.r.r.r = new Node(80);
        assertEquals(70, P.findSecondLargest(root));
    }

    @Test
    void itReturnsTheLargestValueOfTheLeftSubtreeWhenTheRightSubtreeIsNull_leftHeavy() {
        root.l = new Node(30);
        root.l.l = new Node(10);
        root.l.r = new Node(40);

        root.r = new Node(70);
        root.r.l = new Node(60);

        assertEquals(60, P.findSecondLargest(root));
    }

    @Test
    void itReturnsTheLargestValueOfTheLeftSubtreeWhenTheRightSubtreeIsNull_unbalanced1() {
        root.l = new Node(30);
        root.l.l = new Node(10);
        root.l.r = new Node(40);

        root.r = new Node(70);
        root.r.l = new Node(60);

        root.r.l.l = new Node(55);
        root.r.l.r = new Node(65);

        root.r.l.l.r = new Node(58);

        assertEquals(65, P.findSecondLargest(root));
    }

    @Test
    void itReturnsTheLargestValueOfTheLeftSubtreeWhenTheRightSubtreeIsNull_unbalanced2() {
        root.l = new Node(40);
        root.l.l = new Node(30);
        root.l.l.l = new Node(20);
        assertEquals(40, P.findSecondLargest(root));
    }

    @Test
    void itFailsWhenTheTreeHasOneNode() {
        try {
            P.findSecondLargest(root);
            fail(new Throwable());
        } catch (RuntimeException ignored) {
        }
    }

    @Test
    void itFailsWhenTheTreeHasZeroNodes() {
        try {
            P.findSecondLargest(null);
            fail(new Throwable());
        } catch (RuntimeException ignored) {
        }
    }
}
