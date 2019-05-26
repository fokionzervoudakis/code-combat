package dailycodingproblem.problems_071_080;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_076 {
    private Problem_076 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_076();
    }

    @Test
    void itReturnsTheNumberOfColumnsToBeRemoved1() {
        var A = new char[][] { "cba".toCharArray(), "daf".toCharArray(), "ghi".toCharArray() };
        assertEquals(1, P.colCount(A));
    }

    @Test
    void itReturnsTheNumberOfColumnsToBeRemoved2() {
        var A = new char[][] { "abcdef".toCharArray() };
        assertEquals(0, P.colCount(A));
    }

    @Test
    void itReturnsTheNumberOfColumnsToBeRemoved3() {
        var A = new char[][] { "zyx".toCharArray(), "wvu".toCharArray(), "tsr".toCharArray() };
        assertEquals(3, P.colCount(A));
    }
}
