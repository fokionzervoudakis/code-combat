package leetcode.problems_0071_0080;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_0079 {
    private Problem_0079 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0079();
    }

    @Test
    void existTest1() {
        var M = new char[][] {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        assertTrue(P.exist(M, "ABCCED"));
        assertTrue(P.exist(M, "SEE"));
        assertFalse(P.exist(M, "ABCB"));
    }

    @Test
    void existTest2() {
        var M = new char[][] { { 'a', 'a' } };
        assertFalse(P.exist(M, "aaa"));
    }

    @Test
    void existTest3() {
        var M = new char[][] { { 'a', 'b' }, { 'c', 'd' } };
        assertTrue(P.exist(M, "cdba"));
    }
}
