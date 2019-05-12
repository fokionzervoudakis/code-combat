package leetcode.problems_0371_0380;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0371 {
    private Problem_0371 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0371();
    }

    @Test
    void itSumsTwoIntegersIteratively() {
        assertEquals(3, P.it(1, 2));
        assertEquals(5, P.it(2, 3));
    }

    @Test
    void itSumsTwoIntegersRecursively() {
        assertEquals(3, P.rec(1, 2));
        assertEquals(5, P.rec(2, 3));
    }
}
