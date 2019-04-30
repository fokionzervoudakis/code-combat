package projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_002 {
    @Test
    void itCalculatesTheSumOfEvenFibonacciNumbers() {
        var P = new Problem_002();
        assertEquals(10, P.evenFib(10));
        assertEquals(4613732, P.evenFib(4_000_000));
    }
}
