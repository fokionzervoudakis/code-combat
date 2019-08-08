package dailycodingproblem.problems_121_130;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_126 {
    @Test
    void rotateTest() {
        var D = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        new Problem_126().rotate(D, 2);

        var expected = "[3, 4, 5, 6, 1, 2]";
        var actual = D.toString();

        assertEquals(expected, actual);
    }
}
