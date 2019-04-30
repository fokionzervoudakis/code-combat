package dailycodingproblem.problems_021_030;

import dailycodingproblem.problems_021_030.Problem_024.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_024 {
    private Node root;

    @BeforeEach
    void beforeEach() {
        root = new Node();
    }

    @Nested
    class WhenTheNodeDoesNotHaveParents {
        @Test
        void itReturnsTrueIfItIsLocked() {
            root.locked = true;
            assertTrue(root.isLocked());
        }

        @Test
        void itReturnsFalseIfItIsNotLocked() {
            assertFalse(root.isLocked());
        }

        @Test
        void itLocksTheNode() {
            assertTrue(root.lock());
            assertTrue(root.isLocked());
        }

        @Test
        void itUnlocksTheNode() {
            assertTrue(root.unlock());
            assertFalse(root.isLocked());
        }
    }

    @Nested
    class WhenTheNodeHasOneParent {
        private Node N;

        @BeforeEach
        void beforeEach() {
            N = new Node();
            N.p = root;
        }

        @Nested
        class WhenTheParentIsLocked {
            @BeforeEach
            void beforeEach() {
                N.p.locked = true;
            }

            @Test
            void itReturnsTrueIfItIsLocked() {
                N.locked = true;
                assertTrue(N.isLocked());
            }

            @Test
            void itReturnsFalseIfItIsNotLocked() {
                assertFalse(N.isLocked());
            }

            @Test
            void itLocksTheNode() {
                assertTrue(N.lock());
                assertTrue(N.isLocked());
            }

            @Test
            void itDoesNotUnlockTheNode() {
                N.locked = true;
                assertFalse(N.unlock());
                assertTrue(N.isLocked());
            }
        }

        @Nested
        class WhenTheParentIsNotLocked {
            @Test
            void itReturnsFalseIfItIsLocked() {
                N.locked = true;
                assertFalse(N.isLocked());
            }

            @Test
            void itReturnsFalseIfItIsNotLocked() {
                assertFalse(N.isLocked());
            }

            @Test
            void itDoesNotLockTheNode() {
                assertFalse(N.lock());
                assertFalse(N.isLocked());
            }

            @Test
            void itUnlocksTheNode() {
                N.locked = true;
                assertTrue(N.unlock());
                assertFalse(N.isLocked());
            }
        }
    }
}
