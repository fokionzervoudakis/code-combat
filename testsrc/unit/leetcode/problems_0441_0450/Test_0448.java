package leetcode.problems_0441_0450;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0448 {
    @Test
    void itFindsAnagrams() {
        var A = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
        var expected = "[5, 6]";
        var actual = new Problem_0448().findDisappearedNumbers(A).toString();
        assertEquals(expected, actual);
    }
}
