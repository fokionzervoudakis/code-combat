package projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_010 {
    @Test
    void itCalculatesTheSumOfPrimes() {
        var P = new Problem_010();
        assertEquals(17, P.primeSum(10));
        assertEquals(142_913_828_922L, P.primeSum(2_000_000));
    }
}
