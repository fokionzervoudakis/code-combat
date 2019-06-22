package dailycodingproblem.problems_101_110;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_102 {
    private Problem_102 P;
    private int[] A;

    @BeforeEach
    void beforeEach() {
        P = new Problem_102();
        A = new int[] { 1, 2, 3, 4, 5 };
    }

    @Test
    void subArraySumTest1() {
        var expected = "[]";
        var actual = P.subArraySum(A, 0).toString();
        assertEquals(expected, actual);
    }

    @Test
    void subArraySumTest2() {
        var expected = "[1]";
        var actual = P.subArraySum(A, 1).toString();
        assertEquals(expected, actual);
    }

    @Test
    void subArraySumTest3() {
        var expected = "[2, 3]";
        var actual = P.subArraySum(A, 5).toString();
        assertEquals(expected, actual);
    }

    @Test
    void subArraySumTest4() {
        var expected = "[2, 3, 4]";
        var actual = P.subArraySum(A, 9).toString();
        assertEquals(expected, actual);
    }

    @Test
    void subArraySumTest5() {
        var expected = "[1, 2, 3, 4, 5]";
        var actual = P.subArraySum(A, 16).toString();
        assertEquals(expected, actual);
    }
}
