package dailycodingproblem.problems_061_070;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_063 {
    private Problem_063 P;
    private char[][] M;

    @BeforeEach
    void beforeEach() {
        P = new Problem_063();
        M = new char[][] {
                { 'F', 'A', 'C', 'I' },
                { 'O', 'B', 'Q', 'P' },
                { 'A', 'N', 'O', 'B' },
                { 'M', 'A', 'S', 'S' }
        };
    }

    @Test
    void itReturnsTrueIfTheWordExistsHorizontally() {
        assertTrue(P.hasWord(M, "MASS"));
        assertTrue(P.hasWord(M, "NO"));
    }

    @Test
    void itReturnsTrueIfTheWordExistsVertically() {
        assertTrue(P.hasWord(M, "FOAM"));
        assertTrue(P.hasWord(M, "AM"));
    }

    @Test
    void itReturnsFalseIfTheWordDoesNotExist() {
        assertFalse(P.hasWord(M, "FORM"));
        assertFalse(P.hasWord(M, "FORMS"));
    }
}
