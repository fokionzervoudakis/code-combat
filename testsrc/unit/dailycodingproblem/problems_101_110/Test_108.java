package dailycodingproblem.problems_101_110;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_108 {
    private Problem_108 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_108();
    }

    @Test
    void canShiftTest1() {
        assertTrue(P.canShift("abcde".toCharArray(), "cdeab".toCharArray()));
    }

    @Test
    void canShiftTest2() {
        assertFalse(P.canShift("abc".toCharArray(), "acb".toCharArray()));
    }
}
