package dailycodingproblem.problems_151_160;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_153 {
    @Test
    void distanceTest() {
        var P = new Problem_153();

        assertNull(P.distance("hello", "hello", "world"));
        assertNull(P.distance("world", "hello", "world"));

        assertEquals(0, P.distance("hello world", "hello", "world").intValue());

        var phrase = "dog cat hello cat dog dog hello cat world";

        assertEquals(1, P.distance(phrase, "hello", "world").intValue());
        assertEquals(2, P.distance(phrase, "dog", "world").intValue());
    }
}
