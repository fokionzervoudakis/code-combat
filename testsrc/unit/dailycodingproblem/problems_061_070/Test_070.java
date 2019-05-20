package dailycodingproblem.problems_061_070;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_070 {
    @Test
    void itReturnsTheNthPerfectNumber() {
        var P = new Problem_070();

        assertEquals(10, P.getNthPerfect(0));
        assertEquals(19, P.getNthPerfect(1));
        assertEquals(28, P.getNthPerfect(2));
        assertEquals(37, P.getNthPerfect(3));
        assertEquals(37, P.getNthPerfect(3));
        assertEquals(46, P.getNthPerfect(4));
        assertEquals(55, P.getNthPerfect(5));
        assertEquals(64, P.getNthPerfect(6));
        assertEquals(73, P.getNthPerfect(7));
        assertEquals(82, P.getNthPerfect(8));
        assertEquals(91, P.getNthPerfect(9));

        assertEquals(100, P.getNthPerfect(10));
        assertEquals(109, P.getNthPerfect(11));

        assertEquals(2008, P.getNthPerfect(22));
        assertEquals(3007, P.getNthPerfect(23));

        assertEquals(40006, P.getNthPerfect(34));
        assertEquals(50005, P.getNthPerfect(35));

        assertEquals(600004, P.getNthPerfect(46));
        assertEquals(700003, P.getNthPerfect(47));

        assertEquals(8000002, P.getNthPerfect(58));
        assertEquals(9000001, P.getNthPerfect(59));
    }
}
