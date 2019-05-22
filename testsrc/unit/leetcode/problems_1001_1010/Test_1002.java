package leetcode.problems_1001_1010;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_1002 {
    private Problem_1002 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_1002();
    }

    @Test
    void commonCharsTest1() {
        var expected = "[e, l, l]";
        var actual = P.commonChars(new String[] { "bella", "label", "roller" }).toString();
        assertEquals(expected, actual);
    }

    @Test
    void commonCharsTest2() {
        var expected = "[c, o]";
        var actual = P.commonChars(new String[] { "cool", "lock", "cook" }).toString();
        assertEquals(expected, actual);
    }

    @Test
    void commonCharsTest3() {
        var A = new String[] { "bbddabab", "cbcddbdd", "bbcadcab", "dabcacad", "cddcacbc", "ccbdbcba", "cbddaccc", "accdcdbb" };
        var expected = "[b, d]";
        var actual = P.commonChars(A).toString();
        assertEquals(expected, actual);
    }
}
