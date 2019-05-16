package dailycodingproblem.problems_061_070;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_065 {
    @Test
    void itOrdersElementsInAClockwiseSpiral() {
        var P = new Problem_065();
        var M = new int[][] {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }
        };
        var expected = "[1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12]";
        var actual = P.clockwise(M).toString();
        assertEquals(expected, actual);
    }
}
