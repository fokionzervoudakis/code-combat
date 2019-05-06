package csdojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NegNumTest {
    private NegNum negNum;

    @BeforeEach
    void beforeEach() {
        negNum = new NegNum();
    }

    @Test
    void itCountsZeroNegativeIntegers() {
        assertEquals(0, negNum.count(new int[][] { {} }));
        assertEquals(0, negNum.count(new int[][] { { 0 } }));
        assertEquals(0, negNum.count(new int[][] { { 1, 2, 3 } }));
    }

    @Test
    void itCountsOneNegativeInteger() {
        assertEquals(1, negNum.count(new int[][] { { -1 } }));
        assertEquals(1, negNum.count(new int[][] { { -1, 0, 1, 2 } }));
    }

    @Test
    void itCountsManyNegativeIntegers() {
        var M = new int[][] {
                { -3, -2, -1, 1 },
                { -2, 2, 3, 4 },
                { 4, 5, 7, 8 }
        };
        assertEquals(4, negNum.count(M));
    }
}
