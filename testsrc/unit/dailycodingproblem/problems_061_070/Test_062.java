package dailycodingproblem.problems_061_070;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_062 {
    @Nested
    class WhenItUsesRecursion {
        private Problem_062.Rec R;

        @BeforeEach
        void beforeEach() {
            R = new Problem_062().new Rec();
        }

        @Test
        void itCountsPathsInASquareMatrix() {
            assertEquals(1, R.countPaths(1, 1));
            assertEquals(2, R.countPaths(2, 2));
            assertEquals(6, R.countPaths(3, 3));
            assertEquals(70, R.countPaths(5, 5));
        }

        @Test
        void itCountsPathsInARectangularMatrix() {
            assertEquals(1, R.countPaths(1, 2));
            assertEquals(3, R.countPaths(2, 3));
            assertEquals(10, R.countPaths(3, 4));
            assertEquals(126, R.countPaths(5, 6));
        }
    }

    @Nested
    class WhenItUsesMemoization {
        private Problem_062.Mem M;

        @BeforeEach
        void beforeEach() {
            M = new Problem_062().new Mem();
        }

        @Test
        void itCountsPathsInARectangularMatrix_5() {
            assertEquals(1916797311, M.countPaths(51, 9));
        }

        @Test
        void itCountsPathsInARectangularMatrix_6() {
            assertEquals(193536720, M.countPaths(23, 12));
        }
    }

    @Nested
    class WhenItUsesTabulation {
        private Problem_062.Tab T;

        @BeforeEach
        void beforeEach() {
            T = new Problem_062().new Tab();
        }

        @Test
        void itCountsPathsInARectangularMatrix_5() {
            assertEquals(1916797311, T.countPaths(51, 9));
        }

        @Test
        void itCountsPathsInARectangularMatrix_6() {
            assertEquals(193536720, T.countPaths(23, 12));
        }
    }
}
