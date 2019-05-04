package dailycodingproblem.problems_031_040;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_031 {
    private Problem_031 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_031();
    }

    @Test
    void itCalculatesTheEditDistanceWhenBothStringsAreEmpty() {
        assertEquals(0, P.editDist("", ""));
    }

    @Test
    void itCalculatesTheEditDistanceWithEquivalentStrings() {
        assertEquals(0, P.editDist("abc", "abc"));
    }

    @Test
    void itCalculatesTheEditDistanceWithOneDifference() {
        assertEquals(1, P.editDist("a", "b"));
    }

    @Test
    void itCalculatesTheEditDistanceWithManyDifferences() {
        assertEquals(3, P.editDist("kitten", "sitting"));
    }
}
