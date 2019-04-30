package dailycodingproblem.problems_031_040;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_037 {
    private Problem_037 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_037();
    }

    @Test
    void itGeneratesThePowerSetOfZeroElements() {
        var expected = "[[]]";
        var actual = P.generate(new int[0]).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itGeneratesThePowerSetOfOneElement() {
        var expected = "[[], [1]]";
        var actual = P.generate(new int[] { 1 }).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itGeneratesThePowerSetOfManyElements() {
        var expected = "[[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]";
        var actual = P.generate(new int[] { 1, 2, 3 }).toString();
        assertEquals(expected, actual);
    }
}
