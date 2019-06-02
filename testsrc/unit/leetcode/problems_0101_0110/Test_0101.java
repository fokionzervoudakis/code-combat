package leetcode.problems_0101_0110;

import leetcode.problems_0101_0110.Problem_0101.Inversion;
import leetcode.problems_0101_0110.Problem_0101.Iteration;
import leetcode.problems_0101_0110.Problem_0101.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_0101 {
    @Nested
    class WhenItUsesInversion {
        private Inversion in;

        @BeforeEach
        void beforeEach() {
            in = new Problem_0101().new Inversion();
        }

        @Test
        void itReturnsTrueWhenTheTreeIsSymmetric() {
            var N = new Node(1);

            N.l = new Node(2);
            N.r = new Node(2);

            N.l.l = new Node(3);
            N.l.r = new Node(4);

            N.r.l = new Node(4);
            N.r.r = new Node(3);

            assertTrue(in.isSymmetric(N));
        }

        @Test
        void itReturnsFalseWhenTheTreeIsNotSymmetric1() {
            var N = new Node(1);

            N.l = new Node(2);
            N.r = new Node(2);

            N.l.r = new Node(3);

            N.r.r = new Node(3);

            assertFalse(in.isSymmetric(N));
        }

        @Test
        void itReturnsFalseWhenTheTreeIsNotSymmetric2() {
            var N = new Node(1);

            N.l = new Node(2);
            N.r = new Node(2);

            N.l.l = new Node(2);

            N.r.l = new Node(2);

            assertFalse(in.isSymmetric(N));
        }
    }

    @Nested
    class WhenItUsesIteration {
        private Iteration it;

        @BeforeEach
        void beforeEach() {
            it = new Problem_0101().new Iteration();
        }

        @Test
        void itReturnsTrueWhenTheTreeIsSymmetric() {
            var N = new Node(1);

            N.l = new Node(2);
            N.r = new Node(2);

            N.l.l = new Node(3);
            N.l.r = new Node(4);

            N.r.l = new Node(4);
            N.r.r = new Node(3);

            assertTrue(it.isSymmetric(N));
        }

        @Test
        void itReturnsFalseWhenTheTreeIsNotSymmetric1() {
            var N = new Node(1);

            N.l = new Node(2);
            N.r = new Node(2);

            N.l.r = new Node(3);

            N.r.r = new Node(3);

            assertFalse(it.isSymmetric(N));
        }

        @Test
        void itReturnsFalseWhenTheTreeIsNotSymmetric2() {
            var N = new Node(1);

            N.l = new Node(2);
            N.r = new Node(2);

            N.l.l = new Node(2);

            N.r.l = new Node(2);

            assertFalse(it.isSymmetric(N));
        }
    }
}
