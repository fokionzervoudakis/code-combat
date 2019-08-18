package dailycodingproblem.problems_151_160;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_159 {
    @Test
    void getFirstRecurringTest() {
        var P = new Problem_159();
        assertEquals('b', P.getFirstRecurring("acbbac").charValue());
        assertNull(P.getFirstRecurring("abcdef"));
    }
}
