package dailycodingproblem.problems_111_120;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_118 {
    @Test
    void squareSortTest() {
        var A = new int[] { -9, -2, 0, 2, 3 };
        new Problem_118().squareSort(A);
        var expected = "[0, 4, 4, 9, 81]";
        var actual = Arrays.toString(A);
        assertEquals(expected, actual);
    }
}
