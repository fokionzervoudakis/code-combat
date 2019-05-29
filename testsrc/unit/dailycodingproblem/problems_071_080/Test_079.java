package dailycodingproblem.problems_071_080;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_079 {
    private Problem_079 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_079();
    }

    @Test
    void itReturnsTrueIfTheArrayCanBeOrderedWithOneEdit() {
        assertTrue(P.canEdit(new int[] { 10, 5, 7 }));
    }

    @Test
    void itReturnsFalseIfTheArrayCannotBeOrderedWithOneEdit() {
        assertFalse(P.canEdit(new int[] { 10, 5, 1 }));
    }
}
