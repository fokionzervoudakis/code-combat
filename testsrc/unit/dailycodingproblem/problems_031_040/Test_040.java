package dailycodingproblem.problems_031_040;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_040 {
    @Test
    void itReturnsTheUniqueInteger() {
        var P = new Problem_040();
        assertEquals(1, P.getUnique(new int[] { 6, 1, 3, 3, 3, 6, 6 }));
        assertEquals(19, P.getUnique(new int[] { 13, 19, 13, 13 }));
    }
}
