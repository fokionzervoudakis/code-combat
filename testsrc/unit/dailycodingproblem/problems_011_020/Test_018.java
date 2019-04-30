package dailycodingproblem.problems_011_020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_018 {
    @Test
    void itIncreasesTheSizeOfTheBackingArrayIfItsCapacityIsExceeded() {
        var expected = "[10, 7, 8, 8]";
        var actual = new Problem_018().slidingMax(new int[] { 10, 5, 2, 7, 8, 7 }, 3).toString();
        assertEquals(expected, actual);
    }
}
