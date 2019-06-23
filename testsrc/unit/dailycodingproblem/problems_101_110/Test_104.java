package dailycodingproblem.problems_101_110;

import dailycodingproblem.problems_101_110.Problem_104.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_104 {
    private Problem_104 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_104();
    }

    @Nested
    class WhenTheLinkedListHasAnEvenNumberOfNodes {
        @Test
        void itReturnsTrueIfTheLinkedListIsAPalindrome() {
            var N1 = new Node(1);
            var N2 = new Node(2);
            var N3 = new Node(2);
            var N4 = new Node(1);

            N1.next = N2;
            N2.next = N3;
            N3.next = N4;

            assertTrue(P.isPalindrome(N1));
        }

        @Test
        void itReturnsFalseIfTheLinkedListIsNotAPalindrome() {
            var N1 = new Node(1);
            var N2 = new Node(2);
            var N3 = new Node(3);
            var N4 = new Node(4);

            N1.next = N2;
            N2.next = N3;
            N3.next = N4;

            assertFalse(P.isPalindrome(N1));
        }
    }

    @Nested
    class WhenTheLinkedListHasAnOddNumberOfNodes {
        @Test
        void itReturnsTrueIfTheLinkedListIsAPalindrome() {
            var N1 = new Node(1);
            var N2 = new Node(2);
            var N3 = new Node(1);

            N1.next = N2;
            N2.next = N3;

            assertTrue(P.isPalindrome(N1));
        }

        @Test
        void itReturnsFalseIfTheLinkedListIsNotAPalindrome() {
            var N1 = new Node(1);
            var N2 = new Node(2);
            var N3 = new Node(3);

            N1.next = N2;
            N2.next = N3;

            assertFalse(P.isPalindrome(N1));
        }
    }

    @Test
    void itReturnsTrueWhenTheLinkedListHasZeroNodes() {
        assertTrue(P.isPalindrome(null));
    }
}
