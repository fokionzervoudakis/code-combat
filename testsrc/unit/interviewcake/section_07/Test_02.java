package interviewcake.section_07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_02 {
    private Problem_02.Queue<Integer> Q;

    @BeforeEach
    void beforeEach() {
        Q = new Problem_02().new Queue<>();
    }

    @Test
    void itAddsAndRemovesElements() {
        Q.enqueue(1);
        Q.enqueue(2);
        Q.enqueue(3);

        assertEquals(1, Q.dequeue().intValue());
        assertEquals(2, Q.dequeue().intValue());

        Q.enqueue(4);

        assertEquals(3, Q.dequeue().intValue());
        assertEquals(4, Q.dequeue().intValue());
    }

    @Test
    void itReturnsNullWhenItRemovesAnElementFromANewQueue() {
        assertNull(Q.dequeue());
    }

    @Test
    void itReturnsNullWhenItRemovesAnElementFromAnEmptyQueue() {
        Q.enqueue(1);
        Q.enqueue(2);
        Q.dequeue();
        Q.dequeue();
        assertNull(Q.dequeue());
    }
}
