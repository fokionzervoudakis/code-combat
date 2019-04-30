package interviewcake.section_07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_01 {
    @Test
    void itReturnsTheLargestElementInTheStack() {
        var stack = new Problem_01().new MaxStack();

        stack.push(5);

        assertEquals(5, stack.getMax());

        stack.push(4);
        stack.push(7);
        stack.push(7);
        stack.push(8);

        assertEquals(8, stack.getMax());
        assertEquals(8, stack.pop());

        assertEquals(7, stack.getMax());
        assertEquals(7, stack.pop());

        assertEquals(7, stack.getMax());
        assertEquals(7, stack.pop());

        assertEquals(5, stack.getMax());
        assertEquals(4, stack.pop());

        assertEquals(5, stack.getMax());
    }
}
