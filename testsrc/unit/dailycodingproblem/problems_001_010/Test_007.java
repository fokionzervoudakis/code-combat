package dailycodingproblem.problems_001_010;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_007 {
    private Problem_007 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_007();
    }

    @Test
    void itDecodesMessagesWithOneNumber() {
        assertEquals(1, P.getMsgCount("1"));
        assertEquals(1, P.getMsgCount("9"));
    }

    @Test
    void itDecodesMessagesWithManyNumbers() {
        assertEquals(2, P.getMsgCount("10"));
        assertEquals(2, P.getMsgCount("26"));
        assertEquals(1, P.getMsgCount("27"));
        assertEquals(3, P.getMsgCount("111"));
        assertEquals(5, P.getMsgCount("1111"));
        assertEquals(4, P.getMsgCount("1311"));
    }
}
