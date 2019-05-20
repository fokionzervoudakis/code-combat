package leetcode.problems_0071_0080;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0075 {
    private Problem_0075 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0075();
    }

    @Test
    void itSortsZeroColors() {
        var A = new int[0];
        P.sortColors(A);
        assertEquals("[]", Arrays.toString(A));
    }

    @Test
    void itSortsOneColor() {
        var A = new int[] { 0 };
        P.sortColors(A);
        assertEquals("[0]", Arrays.toString(A));
    }

    @Test
    void itSortsManyUniqueColors() {
        var A = new int[] { 2, 0, 1 };
        P.sortColors(A);
        assertEquals("[0, 1, 2]", Arrays.toString(A));
    }

    @Test
    void itSortsManyDuplicateColors() {
        var A = new int[] { 2, 0, 2, 1, 1, 0 };
        P.sortColors(A);
        assertEquals("[0, 0, 1, 1, 2, 2]", Arrays.toString(A));
    }
}
