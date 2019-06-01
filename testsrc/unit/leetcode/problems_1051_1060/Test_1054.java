package leetcode.problems_1051_1060;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Test_1054 {
    private Problem_1054 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_1054();
    }

    @Test
    void rearrangeBarCodesTest1() {
        var A = new int[] { 0 };
        P.rearrangeBarCodes(A);
        assertEquals("[0]", Arrays.toString(A));
    }

    @Test
    void rearrangeBarCodesTest2() {
        var A = new int[] { 1, 2, 1 };
        P.rearrangeBarCodes(A);
        assertEquals("[1, 2, 1]", Arrays.toString(A));
    }

    @Test
    void rearrangeBarCodesTest3() {
        var A = new int[] { 1, 1, 1, 2, 2, 2 };
        P.rearrangeBarCodes(A);
        for (var i = 0; i < A.length - 1; i++) {
            assertNotEquals(A[i], A[i + 1]);
        }
    }

    @Test
    void rearrangeBarCodesTest4() {
        var A = new int[] { 4, 4, 4, 4, 3, 3, 7, 3, 7, 3 };
        P.rearrangeBarCodes(A);
        for (var i = 0; i < A.length - 1; i++) {
            assertNotEquals(A[i], A[i + 1]);
        }
    }
}
