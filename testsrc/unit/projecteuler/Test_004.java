package projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_004 {
    @Test
    void itCalculatesTheMaxPalindrome() {
        var P = new Problem_004();
        assertEquals(9009, P.maxPalindrome(99, 10));
        assertEquals(906609, P.maxPalindrome(999, 100));
    }
}
