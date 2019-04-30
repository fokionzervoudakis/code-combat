package dailycodingproblem.problems_001_010;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_002 {
    private Problem_002 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_002();
    }

    @Test
    void itCalculatesTheProducts_1() {
        var expected = "[120, 60, 40, 30, 24]";
        var actual = Arrays.toString(P.products(new int[] { 1, 2, 3, 4, 5 }));
        assertEquals(expected, actual);
    }

    @Test
    void itCalculatesTheProducts_2() {
        var expected = "[2, 3, 6]";
        var actual = Arrays.toString(P.products(new int[] { 3, 2, 1 }));
        assertEquals(expected, actual);
    }
}
