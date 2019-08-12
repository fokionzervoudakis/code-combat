package dailycodingproblem.problems_151_160;

import dailycodingproblem.problems_151_160.Problem_154.HeapStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_154 {
    @Test
    void heapStackTest() {
        var stack = new HeapStack();

        stack.push(1);
        stack.push(7);
        stack.push(4);

        assertEquals(4, stack.pop().intValue());

        stack.push(2);

        assertEquals(2, stack.pop().intValue());
        assertEquals(7, stack.pop().intValue());
        assertEquals(1, stack.pop().intValue());

        assertNull(stack.pop());
    }
}
