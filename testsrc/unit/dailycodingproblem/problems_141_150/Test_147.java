package dailycodingproblem.problems_141_150;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_147 {
    private Problem_147 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_147();
    }

    @Test
    void itSortsZeroElements() {
        var A = new int[0];
        P.sort(A);
        assertEquals("[]", Arrays.toString(A));
    }

    @Test
    void itSortsOneElement() {
        var A = new int[] { 1 };
        P.sort(A);
        assertEquals("[1]", Arrays.toString(A));
    }

    @Test
    void itSortsAnEvenNumberOfElements() {
        var A = new int[] { 5, 2, 1, 3, 6, 4 };
        P.sort(A);
        assertEquals("[1, 2, 3, 4, 5, 6]", Arrays.toString(A));
    }

    @Test
    void itSortsAnOddNumberOfElements() {
        var A = new int[] { 5, 2, 1, 3, 4 };
        P.sort(A);
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(A));
    }

    @Test
    void itSortsDuplicateElements() {
        var A = new int[] { 5, 5, 2, 1, 1, 3, 4, 3, 3 };
        P.sort(A);
        assertEquals("[1, 1, 2, 3, 3, 3, 4, 5, 5]", Arrays.toString(A));
    }

    @Test
    void itSortsNegativeElements() {
        var A = new int[] { -5, -2, -1, -3, -4 };
        P.sort(A);
        assertEquals("[-5, -4, -3, -2, -1]", Arrays.toString(A));
    }

    @Test
    void itSortsMixedElements() {
        var A = new int[] { 5, -2, 1, -3, 4 };
        P.sort(A);
        assertEquals("[-3, -2, 1, 4, 5]", Arrays.toString(A));
    }
}
