package dailycodingproblem.problems_081_090;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_085 {
    private Problem_085 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_085();
    }

    @Test
    void itReturnsTheFirstNumberIfTheThirdNumberIsOne() {
        assertEquals(2, P.getNum(2, 3, 1));
    }

    @Test
    void itReturnsTheSecondNumberIfTheThirdNumberIsZero() {
        assertEquals(5, P.getNum(4, 5, 0));
    }
}
