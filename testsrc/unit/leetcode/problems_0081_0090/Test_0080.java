package leetcode.problems_0081_0090;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0080 {
    private Problem_0080 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0080();
    }

    @Test
    void itRemovesDuplicates_1() {
        var A = new int[] { 1, 1, 1, 2, 2, 3 };
        assertEquals(5, P.removeDuplicates(A));
        var expected = "[1, 1, 2, 2, 3, 3]";
        var actual = Arrays.toString(A);
        assertEquals(expected, actual);
    }

    @Test
    void itRemovesDuplicates_2() {
        var A = new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        assertEquals(7, P.removeDuplicates(A));
        var expected = "[0, 0, 1, 1, 2, 3, 3, 3, 3]";
        var actual = Arrays.toString(A);
        assertEquals(expected, actual);
    }
}
