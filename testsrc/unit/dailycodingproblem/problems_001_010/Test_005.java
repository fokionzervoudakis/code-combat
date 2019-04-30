package dailycodingproblem.problems_001_010;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_005 {
    private Problem_005 P;
    private Problem_005.F2 F;

    @BeforeEach
    void beforeEach() {
        P = new Problem_005();
        F = P.cons(3, 4);
    }

    @Test
    void itReturnsTheLeftNumber() {
        assertEquals(3, P.car(F));
    }

    @Test
    void itReturnsTheRightNumber() {
        assertEquals(4, P.cdr(F));
    }
}
