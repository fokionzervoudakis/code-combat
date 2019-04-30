package interviewcake.section_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Test_01 {
    private Problem_01 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_01();
    }

    @Nested
    class WhenItUsesBruteForce {
        @Test
        void itMakesAProfitWhenThePriceGoesUpAndDown() {
            assertEquals(4, P.getMaxProfit1(new int[] { 1, 5, 3, 2 }));
        }

        @Test
        void itMakesAProfitWhenThePriceGoesDownAndUp() {
            assertEquals(7, P.getMaxProfit1(new int[] { 7, 2, 8, 9 }));
        }

        @Test
        void itMakesAProfitWhenThePriceGoesUp() {
            assertEquals(8, P.getMaxProfit1(new int[] { 1, 6, 7, 9 }));
        }

        @Test
        void itMakesANegativeProfitWhenThePriceGoesDown() {
            assertEquals(-2, P.getMaxProfit1(new int[] { 9, 7, 4, 1 }));
        }

        @Test
        void itMakesZeroProfitWhenThePriceStaysTheSame() {
            assertEquals(0, P.getMaxProfit1(new int[] { 1, 1, 1, 1 }));
        }

        @Test
        void itFailsWithZeroPrices() {
            try {
                P.getMaxProfit1(new int[0]);
                fail(new Throwable());
            } catch (RuntimeException ignored) {
            }
        }

        @Test
        void itFailsWithOnePrice() {
            try {
                P.getMaxProfit1(new int[] { 5 });
                fail(new Throwable());
            } catch (RuntimeException ignored) {
            }
        }
    }

    @Nested
    class WhenItIsGreedy {
        @Test
        void itMakesAProfitWhenThePriceGoesUpAndDown() {
            assertEquals(4, P.getMaxProfit2(new int[] { 1, 5, 3, 2 }));
        }

        @Test
        void itMakesAProfitWhenThePriceGoesDownAndUp() {
            assertEquals(7, P.getMaxProfit2(new int[] { 7, 2, 8, 9 }));
        }

        @Test
        void itMakesAProfitWhenThePriceGoesUp() {
            assertEquals(8, P.getMaxProfit2(new int[] { 1, 6, 7, 9 }));
        }

        @Test
        void itMakesANegativeProfitWhenThePriceGoesDown() {
            assertEquals(-2, P.getMaxProfit2(new int[] { 9, 7, 4, 1 }));
        }

        @Test
        void itMakesZeroProfitWhenThePriceStaysTheSame() {
            assertEquals(0, P.getMaxProfit2(new int[] { 1, 1, 1, 1 }));
        }

        @Test
        void itFailsWithZeroPrices() {
            try {
                P.getMaxProfit2(new int[0]);
                fail(new Throwable());
            } catch (RuntimeException ignored) {
            }
        }

        @Test
        void itFailsWithOnePrice() {
            try {
                P.getMaxProfit2(new int[] { 5 });
                fail(new Throwable());
            } catch (RuntimeException ignored) {
            }
        }
    }
}
