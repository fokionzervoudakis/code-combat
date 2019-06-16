package dailycodingproblem.problems_091_100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_095 {
    private Problem_095 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_095();
    }

    @Test
    void itGeneratesTheNextLexicographicPermutation1() {
        var A = new int[] { 1, 5, 1 };
        P.nextPermutation(A);
        var expected = "[5, 1, 1]";
        var actual = Arrays.toString(A);
        assertEquals(expected, actual);
    }

    @Test
    void itGeneratesTheNextLexicographicPermutation2() {
        var A = new int[] { 1, 2, 3, 5, 4 };
        P.nextPermutation(A);
        var expected = "[1, 2, 4, 3, 5]";
        var actual = Arrays.toString(A);
        assertEquals(expected, actual);
    }

    @Test
    void itGeneratesTheNextLexicographicPermutationWhenTheArrayIsAscending() {
        var A = new int[] { 1, 2, 3 };
        P.nextPermutation(A);
        var expected = "[1, 3, 2]";
        var actual = Arrays.toString(A);
        assertEquals(expected, actual);
    }

    @Test
    void itGeneratesTheNextLexicographicPermutationWhenTheArrayIsDescending() {
        var A = new int[] { 3, 2, 1 };
        P.nextPermutation(A);
        var expected = "[1, 2, 3]";
        var actual = Arrays.toString(A);
        assertEquals(expected, actual);
    }
}
