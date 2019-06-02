package leetcode.problems_0281_0290;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0283 {
    @Test
    void itMovesZerosToTheEnd() {
        var A = new int[] { 0, 1, 0, 3, 12 };
        new Problem_0283().moveZeroes(A);
        assertEquals("[1, 3, 12, 0, 0]", Arrays.toString(A));
    }
}
