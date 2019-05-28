package dailycodingproblem.problems_071_080;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_078 {
    private Problem_078 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_078();
    }

    @Test
    void itMergesSortedArraysWithUniqueElements() {
        var M = new int[][] {
                { 1, 10, 11, 15 },
                { 2, 4, 9, 14 },
                { 5, 6, 8, 16 },
                { 3, 7, 12, 13 }
        };
        var expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]";
        var actual = P.kWayMerge(M).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itMergesSortedArraysWithDuplicateElements() {
        var M = new int[][] {
                { 1, 1, 11, 15 },
                { 2, 4, 9, 14 },
                { 5, 6, 8, 8 },
                { 3, 7, 12, 13 }
        };
        var expected = "[1, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 11, 12, 13, 14, 15]";
        var actual = P.kWayMerge(M).toString();
        assertEquals(expected, actual);
    }
}
