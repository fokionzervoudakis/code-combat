package projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_006 {
    @Test
    void itCalculatesTheDifferenceBetweenTheSumAndSquare() {
        var P = new Problem_006();
        assertEquals(2640, P.diff(10));
        assertEquals(25164150, P.diff(100));
    }
}
