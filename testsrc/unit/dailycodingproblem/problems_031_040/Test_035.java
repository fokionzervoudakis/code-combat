package dailycodingproblem.problems_031_040;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_035 {
    private Problem_035 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_035();
    }

    @Test
    void itSegregatesZeroCharacters() {
        var A = new char[0];
        P.segregate(A);
        assertEquals("[]", Arrays.toString(A));
    }

    @Test
    void itSegregatesOneCharacter() {
        var A = new char[] { 'R' };
        P.segregate(A);
        assertEquals("[R]", Arrays.toString(A));
    }

    @Test
    void itSegregatesManyCharacters() {
        var A = new char[] { 'R', 'R', 'R' };
        P.segregate(A);
        assertEquals("[R, R, R]", Arrays.toString(A));
    }

    @Test
    void itSegregatesManyMixedCharacters() {
        var A = new char[] { 'G', 'B', 'R', 'R', 'B', 'R', 'G' };
        P.segregate(A);
        assertEquals("[R, R, R, G, G, B, B]", Arrays.toString(A));
    }
}
