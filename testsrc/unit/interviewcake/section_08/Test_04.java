package interviewcake.section_08;

import interviewcake.section_08.Problem_04.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Test_04 {
    private Problem_04 P;
    private Node hed;

    @BeforeEach
    void beforeEach() {
        P = new Problem_04();
        hed = new Node(1);
        append(hed, 2);
        append(hed, 3);
        append(hed, 4);
    }

    @Nested
    class WhenItUsesOnePass {
        @Test
        void itReturnsTheLastNode() {
            var expected = "[4] -> null";
            var actual = P.kthToLastNode1(1, hed).toString();
            assertEquals(expected, actual);
        }

        @Test
        void itReturnsTheSecondToLastNode() {
            var expected = "[3] -> [4] -> null";
            var actual = P.kthToLastNode1(2, hed).toString();
            assertEquals(expected, actual);
        }

        @Test
        void itReturnsTheFirstNode() {
            var expected = "[1] -> [2] -> [3] -> [4] -> null";
            var actual = P.kthToLastNode1(4, hed).toString();
            assertEquals(expected, actual);
        }

        @Test
        void itFailsWhenKIsGreaterThanTheListLength() {
            try {
                P.kthToLastNode1(5, hed);
                fail(new Throwable());
            } catch (RuntimeException ignored) {
            }
        }

        @Test
        void itFailsWhenKIsZero() {
            try {
                P.kthToLastNode1(0, hed);
                fail(new Throwable());
            } catch (RuntimeException ignored) {
            }
        }
    }

    @Nested
    class WhenItUsesTwoPasses {
        @Test
        void itReturnsTheLastNode() {
            var expected = "[4] -> null";
            var actual = P.kthToLastNode2(1, hed).toString();
            assertEquals(expected, actual);
        }

        @Test
        void itReturnsTheSecondToLastNode() {
            var expected = "[3] -> [4] -> null";
            var actual = P.kthToLastNode2(2, hed).toString();
            assertEquals(expected, actual);
        }

        @Test
        void itReturnsTheFirstNode() {
            var expected = "[1] -> [2] -> [3] -> [4] -> null";
            var actual = P.kthToLastNode2(4, hed).toString();
            assertEquals(expected, actual);
        }

        @Test
        void itFailsWhenKIsGreaterThanTheListLength() {
            try {
                P.kthToLastNode2(5, hed);
                fail(new Throwable());
            } catch (RuntimeException ignored) {
            }
        }

        @Test
        void itFailsWhenKIsZero() {
            try {
                P.kthToLastNode2(0, hed);
                fail(new Throwable());
            } catch (RuntimeException ignored) {
            }
        }
    }

    private void append(Node n, int val) {
        while (n.next != null) {
            n = n.next;
        }
        n.next = new Node(val);
    }
}
