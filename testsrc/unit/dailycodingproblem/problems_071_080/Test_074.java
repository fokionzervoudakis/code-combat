package dailycodingproblem.problems_071_080;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_074 {
    private Problem_074 P;

    @BeforeEach
    void before() {
        P = new Problem_074();
    }

    @Test
    void itCountsTheProductInQuadraticTime() {
        assertEquals(1, P.getProdCount1(1, 1));
        assertEquals(4, P.getProdCount1(6, 12));
    }

    @Test
    void itCountsTheProductInLinearTime() {
        assertEquals(1, P.getProdCount2(1, 1));
        assertEquals(4, P.getProdCount2(6, 12));
    }
}
