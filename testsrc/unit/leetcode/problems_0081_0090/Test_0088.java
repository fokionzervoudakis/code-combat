package leetcode.problems_0081_0090;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0088 {
    private Problem_0088 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0088();
    }

    @Test
    void itMergesTwoEmptyArrays() {
        var A = new int[0];
        P.merge(A, 0, new int[0], 0);
        assertEquals("[]", Arrays.toString(A));
    }

    @Test
    void itMergesTwoArraysWhenTheFirstArrayIsEmpty() {
        var A = new int[] { 0, 0, 0, };
        P.merge(A, 0, new int[] { 1, 2, 3 }, 3);
        assertEquals("[1, 2, 3]", Arrays.toString(A));
    }

    @Test
    void itMergesTwoArraysWhenTheSecondArrayIsEmpty() {
        var A = new int[] { 5, 6, 7 };
        P.merge(A, 3, new int[0], 0);
        assertEquals("[5, 6, 7]", Arrays.toString(A));
    }

    @Test
    void itMergesTwoArraysWithEqualLengths() {
        var A = new int[] { 2, 4, 6, 0, 0, 0 };
        P.merge(A, 3, new int[] { 1, 3, 7 }, 3);
        assertEquals("[1, 2, 3, 4, 6, 7]", Arrays.toString(A));
    }

    @Test
    void itMergesTwoArraysWithDifferentLengths() {
        var A = new int[] { 2, 4, 6, 8, 0, 0 };
        P.merge(A, 4, new int[] { 1, 7 }, 2);
        assertEquals("[1, 2, 4, 6, 7, 8]", Arrays.toString(A));
    }
}
