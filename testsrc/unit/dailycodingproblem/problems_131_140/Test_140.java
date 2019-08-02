package dailycodingproblem.problems_131_140;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_140 {
    @Test
    void singleNumberTest() {
        var A = new int[] { 2, 4, 6, 8, 10, 2, 6, 10 };
        var expected = "[4, 8]";
        var actual = Arrays.toString(new Problem_140().singleNumber(A));
        assertEquals(expected, actual);
    }
}
