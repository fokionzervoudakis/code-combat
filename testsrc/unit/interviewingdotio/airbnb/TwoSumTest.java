package interviewingdotio.airbnb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSumTest {
    @Nested
    class WhenItUsesHashing {
        private TwoSum.Hashing H;

        @BeforeEach
        void beforeEach() {
            H = new TwoSum().new Hashing();
        }

        @Test
        void itReturnsAllUniquePairsThatSumUpToK() {
            var A = new int[] { 1, 3, 2, 3, 2, 5, 46, 6, 7, 4 };
            var expected = "{1=4, 2=3}";
            var actual = H.getTwoSumPairs(A, 5).toString();
            assertEquals(expected, actual);
        }

        @Test
        void itReturnsZeroPairsWhenTheSumIsTooSmall() {
            var A = new int[] { 1, 3, 4, 2 };
            var expected = "{}";
            var actual = H.getTwoSumPairs(A, 2).toString();
            assertEquals(expected, actual);
        }

        @Test
        void itReturnsZeroPairsWhenTheSumIsTooLarge() {
            var A = new int[] { 2, 5, 8, 2, 0 };
            var expected = "{}";
            var actual = H.getTwoSumPairs(A, 20).toString();
            assertEquals(expected, actual);
        }
    }

    @Nested
    class WhenItUsesBinarySearch {
        private TwoSum.BinSearch search;

        @BeforeEach
        void beforeEach() {
            search = new TwoSum().new BinSearch();
        }

        @Test
        void itReturnsAllUniquePairsThatSumUpToK() {
            var A = new int[] { 1, 3, 2, 3, 2, 5, 46, 6, 7, 4 };
            var expected = "{1=4, 2=3}";
            var actual = search.getTwoSumPairs(A, 5).toString();
            assertEquals(expected, actual);
        }

        @Test
        void itReturnsZeroPairsWhenTheSumIsTooSmall() {
            var A = new int[] { 1, 3, 4, 2 };
            var expected = "{}";
            var actual = search.getTwoSumPairs(A, 2).toString();
            assertEquals(expected, actual);
        }

        @Test
        void itReturnsZeroPairsWhenTheSumIsTooLarge() {
            var A = new int[] { 2, 5, 8, 2, 0 };
            var expected = "{}";
            var actual = search.getTwoSumPairs(A, 20).toString();
            assertEquals(expected, actual);
        }
    }
}
