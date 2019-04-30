package interviewcake.section_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_04 {
    private Problem_04 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_04();
    }

    @Test
    void itSortsZeroScores() {
        var expected = "[]";
        var actual = Arrays.toString(P.sort(new int[0], 100));
        assertEquals(expected, actual);
    }

    @Test
    void itSortsOneScore() {
        var expected = "[55]";
        var actual = Arrays.toString(P.sort(new int[] { 55 }, 100));
        assertEquals(expected, actual);
    }

    @Test
    void itSortsTwoScores() {
        var expected = "[60, 30]";
        var actual = Arrays.toString(P.sort(new int[] { 30, 60 }, 100));
        assertEquals(expected, actual);
    }

    @Test
    void itSortsManyScores() {
        var expected = "[91, 89, 65, 53, 41, 37]";
        var actual = Arrays.toString(P.sort(new int[] { 37, 89, 41, 65, 91, 53 }, 100));
        assertEquals(expected, actual);
    }

    @Test
    void itSortsDuplicateScores() {
        var expected = "[30, 30, 20, 20, 10, 10]";
        var actual = Arrays.toString(P.sort(new int[] { 20, 10, 30, 30, 10, 20 }, 100));
        assertEquals(expected, actual);
    }
}
