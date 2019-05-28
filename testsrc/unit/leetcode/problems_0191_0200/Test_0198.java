package leetcode.problems_0191_0200;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0198 {
    private Problem_0198 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0198();
    }

    @Test
    void itRobsSomeHouses() {
        assertEquals(4, P.rob(new int[] { 1, 2, 3, 1 }));
    }

    @Test
    void itRobsManyHouses() {
        assertEquals(12, P.rob(new int[] { 2, 7, 9, 3, 1 }));
    }

    @Test
    void itRobsTooManyHouses() {
        var A = new int[] {
                114, 117, 207, 117, 235, 82, 90, 67, 143, 146, 53, 108,
                200, 91, 80, 223, 58, 170, 110, 236, 81, 90, 222, 160,
                165, 195, 187, 199, 114, 235, 197, 187, 69, 129, 64, 214,
                228, 78, 188, 67, 205, 94, 205, 169, 241, 202, 144, 240
        };
        assertEquals(4173, P.rob(A));
    }
}
