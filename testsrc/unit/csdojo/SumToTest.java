package csdojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumToTest {
    private SumTo sumTo;

    @BeforeEach
    void beforeEach() {
        sumTo = new SumTo();
    }

    @Test
    void itCountsOneSubsetWhenTheAmountIsZero() {
        // When the amount is zero, the subset is the empty set.
        assertEquals(1, sumTo.countSets(new int[0], 0));
    }

    @Nested
    class WhenTheAmountIsNotZero {
        private int[] A;

        @BeforeEach
        void beforeEach() {
            A = new int[] { 2, 4, 6, 10 };
        }

        @Test
        void itCountsOneSubsetThatSumsToTheAmount() {
            assertEquals(1, sumTo.countSets(A, 2));
            assertEquals(1, sumTo.countSets(A, 20));
        }

        @Test
        void itCountsManySubsetsThatSumToTheAmount() {
            assertEquals(2, sumTo.countSets(A, 16));
        }
    }
}
