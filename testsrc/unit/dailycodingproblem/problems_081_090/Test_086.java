package dailycodingproblem.problems_081_090;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_086 {
    @Test
    void itCountsTheParenthesesToBeRemoved() {
        var P = new Problem_086();
        assertEquals(1, P.countParen("()())()"));
        assertEquals(2, P.countParen(")("));
        assertEquals(3, P.countParen("()((("));
        assertEquals(4, P.countParen(")()((("));
    }
}
