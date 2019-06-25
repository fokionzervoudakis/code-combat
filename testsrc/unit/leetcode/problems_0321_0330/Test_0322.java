package leetcode.problems_0321_0330;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0322 {
    private Problem_0322 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0322();
    }

    @Test
    void coinChangeTest1() {
        var A = new int[] { 1, 2, 5 };
        assertEquals(3, P.coinChange(A, 11));
    }

    @Test
    void coinChangeTest2() {
        var A = new int[] { 2 };
        assertEquals(-1, P.coinChange(A, 3));
    }
}
