package dailycodingproblem.problems_111_120;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_114 {
    @Test
    void reverseTest() {
        var A = new char[] { 'h', 'e', 'l', 'l', 'o', '/', 'w', 'o', 'r', 'l', 'd', ':', 'h', 'e', 'r', 'e' };
        var S = new HashSet<Character>() {{
            add('/');
            add(':');
        }};
        new Problem_114().reverse(A, S);
        var expected = "[h, e, r, e, /, w, o, r, l, d, :, h, e, l, l, o]";
        var actual = Arrays.toString(A);
        assertEquals(expected, actual);
    }
}
