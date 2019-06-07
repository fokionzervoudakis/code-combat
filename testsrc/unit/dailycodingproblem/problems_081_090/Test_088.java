package dailycodingproblem.problems_081_090;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Test_088 {
    private Problem_088 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_088();
    }

    @Test
    void itCalculatesTheQuotient() {
        assertEquals(0, P.div(0, 1));
        assertEquals(1, P.div(1, 1));
        assertEquals(4, P.div(12, 3));
        assertEquals(4, P.div(13, 3));
        assertEquals(5, P.div(25, 5));
        assertEquals(5, P.div(27, 5));
    }

    @Test
    void itDoesNotDivideByZero_quo() {
        try {
            P.div(0, 0);
            fail(new Throwable());
        } catch (ArithmeticException ignored) {
        }
    }
}
