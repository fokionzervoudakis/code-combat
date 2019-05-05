package dailycodingproblem.problems_051_060;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_055 {
    private Problem_055 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_055();
    }

    @Test
    void itShortensAUrl() {
        var expected = "http://example.com/YWNiZD";
        var actual = P.shorten("foo");
        assertEquals(expected, actual);
    }

    @Test
    void itRestoresAUrl() {
        var expected = "foo";
        var actual = P.restore(P.shorten("foo"));
        assertEquals(expected, actual);
    }
}
