package dailycodingproblem.problems_141_150;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_141 {
    @Test
    void stackListTest() {
        var stack = new Problem_141.ListStack<Integer>();

        stack.push(1, 0);
        assertEquals("[1]", stack.toString());

        stack.push(2, 1);
        stack.push(3, 2);
        assertEquals("[1, 2, 3]", stack.toString());

        assertEquals(3, stack.pop(2).intValue());

        assertEquals("[1, 2]", stack.toString());

        stack.push(6, 0);
        stack.push(7, 0);
        assertEquals("[7, 6, 1, 2]", stack.toString());

        assertEquals(7, stack.pop(0).intValue());

        assertEquals("[6, 1, 2]", stack.toString());
    }
}
