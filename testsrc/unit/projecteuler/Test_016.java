package projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_016 {
    @Test
    void itCalculatesTheSumOfDigits() {
        var P = new Problem_016();
        assertEquals(26, P.sum(15));
        assertEquals(1366, P.sum(1000));
    }
}
