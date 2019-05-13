package leetcode.problems_0071_0080;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0073 {
    private Problem_0073 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0073();
    }

    @Test
    void setMatrixZeroesTest1() {
        var M = new int[][] {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };
        P.setZeroes(M);
        var expected = "[[1, 0, 1], [0, 0, 0], [1, 0, 1]]";
        var actual = Arrays.deepToString(M);
        assertEquals(expected, actual);
    }

    @Test
    void setMatrixZeroesTest2() {
        var M = new int[][] {
                { 0, 1, 2, 0 },
                { 3, 4, 5, 2 },
                { 1, 3, 1, 5 }
        };
        P.setZeroes(M);
        var expected = "[[0, 0, 0, 0], [0, 4, 5, 2], [0, 3, 1, 5]]";
        var actual = Arrays.deepToString(M);
        assertEquals(expected, actual);
    }

    @Test
    void setMatrixZeroesTest3() {
        var M = new int[][] {
                { Integer.MIN_VALUE, 2, 3 }
        };
        P.setZeroes(M);
        var expected = "[[-2147483648, 2, 3]]";
        var actual = Arrays.deepToString(M);
        assertEquals(expected, actual);
    }

    @Test
    void setMatrixZeroesTest4() {
        var M = new int[][] {
                { Integer.MIN_VALUE, Integer.MAX_VALUE }
        };
        P.setZeroes(M);
        var expected = "[[-2147483648, 2147483647]]";
        var actual = Arrays.deepToString(M);
        assertEquals(expected, actual);
    }
}
