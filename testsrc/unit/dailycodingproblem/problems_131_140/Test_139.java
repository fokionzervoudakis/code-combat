package dailycodingproblem.problems_131_140;

import dailycodingproblem.problems_131_140.Problem_139.PeekInterface;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_139 {
    @Test
    void peekTest() {
        var myInterface = new PeekInterface<>(Arrays.asList(1, 2, 3, 4, 5).iterator());

        assertEquals(1, myInterface.peek().intValue());
        assertTrue(myInterface.hasNext());

        assertEquals(1, myInterface.next().intValue());
        assertEquals(2, myInterface.next().intValue());
        assertEquals(3, myInterface.next().intValue());

        assertEquals(4, myInterface.peek().intValue());
        assertTrue(myInterface.hasNext());

        assertEquals(4, myInterface.next().intValue());
        assertTrue(myInterface.hasNext());
        assertEquals(5, myInterface.peek().intValue());
        assertEquals(5, myInterface.next().intValue());

        assertFalse(myInterface.hasNext());
        assertNull(myInterface.peek());
    }
}
