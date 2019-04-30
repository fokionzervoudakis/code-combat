package interviewcake.section_06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Test_02 {
    private Problem_02 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_02();
    }

    @Test
    void zerothFibonacciTest() {
        assertEquals(0, P.fib(0));
        assertEquals(1, P.fib(1));
        assertEquals(1, P.fib(2));
        assertEquals(2, P.fib(3));
        assertEquals(5, P.fib(5));
        assertEquals(55, P.fib(10));
    }

    @Test
    void itFailsWhenTheNumberIsNegative() {
        try {
            P.fib(-1);
            fail(new Throwable());
        } catch (RuntimeException ignored) {
        }
    }
}
