package dailycodingproblem.problems_141_150;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_143 {
    @Test
    void partitionTest() {
        var A = new int[] { 9, 12, 3, 5, 14, 10, 10 };
        var expected = "[9, 3, 5, 10, 10, 12, 14]";
        var actual = new Problem_143().partition(A, 10).toString();
        assertEquals(expected, actual);
    }
}
