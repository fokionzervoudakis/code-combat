package projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_003 {
    @Test
    void itCalculatesTheMaxPrime() {
        var P = new Problem_003();
        assertEquals(29, P.maxPrime(13195L));
        assertEquals(6857, P.maxPrime(600_851_475_143L));
    }
}
