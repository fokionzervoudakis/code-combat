package dailycodingproblem.problems_001_010;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_009 {
    @Test
    void itUsesRecursionToReturnTheSumOfNonAdjacentNumbers() {
        var R = new Problem_009().new Rec();
        assertEquals(13, R.sum(new int[] { 2, 4, 6, 2, 5 }));
        assertEquals(10, R.sum(new int[] { 5, 1, 1, 5 }));
    }

    @Nested
    class WhenItUsesMemoization {
        private Problem_009.Mem M;

        @BeforeEach
        void beforeEach() {
            M = new Problem_009().new Mem();
        }

        @Test
        void itCalculatesTheSumOfNonAdjacentNumbers_1() {
            assertEquals(13, M.sum(new int[] { 2, 4, 6, 2, 5 }));
        }

        @Test
        void itCalculatesTheSumOfNonAdjacentNumbers_2() {
            assertEquals(10, M.sum(new int[] { 5, 1, 1, 5 }));
        }
    }

    @Nested
    class WhenItUsesTabulation {
        private Problem_009.Tab T;

        @BeforeEach
        void beforeEach() {
            T = new Problem_009().new Tab();
        }

        @Test
        void itCalculatesTheSumOfNonAdjacentNumbers_1() {
            assertEquals(13, T.sum(new int[] { 2, 4, 6, 2, 5 }));
        }

        @Test
        void itCalculatesTheSumOfNonAdjacentNumbers_2() {
            assertEquals(10, T.sum(new int[] { 5, 1, 1, 5 }));
        }
    }
}
