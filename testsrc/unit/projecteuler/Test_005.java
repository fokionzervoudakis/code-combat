package projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_005 {
    @Test
    void itCalculatesTheLowestCommonMultiple() {
        var P = new Problem_005();
        assertEquals(2520, P.lcm(10));
        assertEquals(232792560, P.lcm(20));
    }
}
