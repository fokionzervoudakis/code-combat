package projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_001 {
    @Test
    void itCalculatesTheSumOfMultiples() {
        var P = new Problem_001();
        assertEquals(23, P.multiples(10));
        assertEquals(233168, P.multiples(1000));
    }
}
