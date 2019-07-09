package dailycodingproblem.problems_111_120;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_120 {
    @Test
    void singletonTest() {
        assertEquals("first", Problem_120.getInstance().toString());
        assertEquals("second", Problem_120.getInstance().toString());
        assertEquals("first", Problem_120.getInstance().toString());
        assertEquals("second", Problem_120.getInstance().toString());
    }
}
