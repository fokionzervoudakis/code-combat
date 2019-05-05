package dailycodingproblem.problems_011_020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_019 {
    private Problem_019 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_019();
    }

    @Test
    void itMinimizesTheCostForZeroHouses() {
        var M = new int[0][];
        assertEquals(0, P.min(M));
    }

    @Test
    void itMinimizesTheCostForOneHouseAndOneColor() {
        var M = new int[][] { { 1 } };
        assertEquals(1, P.min(M));
    }

    @Test
    void itMinimizesTheCostForOneHouseAndManyColors() {
        var M = new int[][] { { 1, 2, 3, 4, 5 } };
        assertEquals(1, P.min(M));
    }

    @Test
    void itMinimizesTheCostForManyHousesAndManyOrderedColors() {
        var M = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        assertEquals(13, P.min(M));
    }

    @Test
    void itMinimizesTheCostForManyHousesAndManyUnorderedColors() {
        var M = new int[][] {
                { 7, 3, 8, 6, 1, 2 },
                { 5, 6, 7, 2, 4, 3 },
                { 10, 1, 4, 9, 7, 6 }
        };
        assertEquals(4, P.min(M));
    }
}
