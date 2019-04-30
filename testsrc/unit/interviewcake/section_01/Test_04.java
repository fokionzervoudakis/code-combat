package interviewcake.section_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_04 {
    private Problem_04 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_04();
    }

    @Test
    void itMergesTwoEmptyArrays() {
        var A = (P.merge(new int[0], new int[0]));
        assertEquals("[]", Arrays.toString(A));
    }

    @Test
    void itMergesTwoArraysWhenTheFirstArrayIsEmpty() {
        var A = P.merge(new int[0], new int[] { 1, 2, 3 });
        assertEquals("[1, 2, 3]", Arrays.toString(A));
    }

    @Test
    void itMergesTwoArraysWhenTheSecondArrayIsEmpty() {
        var A = P.merge(new int[] { 5, 6, 7 }, new int[0]);
        assertEquals("[5, 6, 7]", Arrays.toString(A));
    }

    @Test
    void itMergesTwoArraysWithEqualLengths() {
        var A = P.merge(new int[] { 2, 4, 6 }, new int[] { 1, 3, 7 });
        assertEquals("[1, 2, 3, 4, 6, 7]", Arrays.toString(A));
    }

    @Test
    void itMergesTwoArraysWithDifferentLengths() {
        var A = P.merge(new int[] { 2, 4, 6, 8 }, new int[] { 1, 7 });
        assertEquals("[1, 2, 4, 6, 7, 8]", Arrays.toString(A));
    }
}
