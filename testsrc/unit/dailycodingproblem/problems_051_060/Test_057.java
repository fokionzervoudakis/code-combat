package dailycodingproblem.problems_051_060;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_057 {
    private Problem_057 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_057();
    }

    @Test
    void itReturnsNullIfItCannotBreakUpOneWord() {
        assertNull(P.breakUp("encyclopedia", 10));
    }

    @Test
    void itReturnsNullIfItCannotBreakUpManyWords() {
        assertNull(P.breakUp("the quick brown fox jumps over the lazy dog", 1));
    }

    @Test
    void itReturnsOneLineWithOneWord() {
        var expected = "[encyclopedia]";
        var actual = P.breakUp("encyclopedia", 12).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsOneLineWithManyWords() {
        var expected = "[the quick, brown fox, jumps over, the lazy, dog]";
        var actual = P.breakUp("the quick brown fox jumps over the lazy dog", 10).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsManyLinesWithOneWord() {
        var expected = "[the, quick, brown, fox, jumps, over, the, lazy, dog]";
        var actual = P.breakUp("the quick brown fox jumps over the lazy dog", 5).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsManyLinesWithManyWords() {
        var expected = "[the quick brown fox jumps over the lazy dog]";
        var actual = P.breakUp("the quick brown fox jumps over the lazy dog", 100).toString();
        assertEquals(expected, actual);
    }
}
