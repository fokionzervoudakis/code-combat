package dailycodingproblem.problems_001_010;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_001 {
    private Problem_001 P;
    private int[] A;

    @BeforeEach
    void beforeEach() {
        P = new Problem_001();
        A = new int[] { 10, 15, 3, 7 };
    }

    @Test
    void itReturnsTrueWhenTwoNumbersAddUpToK() {
        assertTrue(P.addUp(A, 17));
    }

    @Test
    void itReturnsFalseWhenTwoNumbersDoNotAddUpToK() {
        assertFalse(P.addUp(A, 19));
    }
}
