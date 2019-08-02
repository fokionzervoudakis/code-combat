package dailycodingproblem.problems_131_140;

import dailycodingproblem.problems_131_140.Problem_137.BitArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_137 {
    @Test
    void bitArrayTest() {
        var arr = new BitArray(10);

        arr.set(0, 1);
        arr.set(3, 1);

        assertEquals(1, arr.get(0));
        assertEquals(1, arr.get(3));

        var expected = "[1, 0, 0, 1, 0, 0, 0, 0, 0, 0]";
        var actual = Arrays.toString(arr.A);

        assertEquals(expected, actual);
    }
}
