package dailycodingproblem.problems_021_030;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_025 {
    @Test
    void itMatchesAStringAgainstARegularExpression() {
        var P = new Problem_025();
        assertTrue(P.match("ray", "ra."));
        assertTrue(P.match("chat", ".*at"));
        assertFalse(P.match("chats", ".*at"));
    }
}
