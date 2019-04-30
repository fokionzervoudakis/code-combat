package dailycodingproblem.problems_001_010;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_010 {
    @Test
    void itCallsTheFunction() {
        assertEquals("foo", new Problem_010().call(() -> "foo", 10));
    }
}
