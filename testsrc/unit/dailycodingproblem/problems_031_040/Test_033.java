package dailycodingproblem.problems_031_040;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_033 {
    private Problem_033 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_033();
    }

    @Test
    void itCalculatesTheRunningMedianWithZeroElements() {
        var expected = "[]";
        var actual = P.median(new int[0]).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itCalculatesTheRunningMedianWithOneElement() {
        var expected = "[1.0]";
        var actual = P.median(new int[] { 1 }).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itCalculatesTheRunningMedianWithManyElements() {
        var expected = "[2.0, 1.5, 2.0, 3.5, 2.0, 2.0, 2.0]";
        var actual = P.median(new int[] { 2, 1, 5, 7, 2, 0, 5 }).toString();
        assertEquals(expected, actual);
    }
}
