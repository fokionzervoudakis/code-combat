package dailycodingproblem.problems_061_070;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_061 {
    @Test
    void itRaisesTheFirstArgumentToThePowerOfTheSecondArgument() {
        var P = new Problem_061();
        assertEquals(1, P.power(1, 0));
        assertEquals(1, P.power(1, 1));
        assertEquals(1, P.power(1, 2));
        assertEquals(2, P.power(2, 1));
        assertEquals(4, P.power(2, 2));
        assertEquals(8, P.power(2, 3));
        assertEquals(1024, P.power(2, 10));
    }
}
