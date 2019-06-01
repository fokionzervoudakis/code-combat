package dailycodingproblem.problems_081_090;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_082 {
    private Problem_082 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_082("Hello, world!");
    }

    @Test
    void itReadsSevenCharacters() {
        assertEquals("Hello, ", P.read7());
        assertEquals("world!", P.read7());
        assertTrue(P.read7().isEmpty());
    }

    @Test
    void itReadsSixCharacters() {
        assertEquals("Hello,", P.readN(6));
        assertEquals(" world", P.readN(6));
        assertEquals("!", P.readN(6));
        assertTrue(P.readN(6).isEmpty());
    }

    @Test
    void itReadsEightCharacters() {
        assertEquals("Hello, w", P.readN(8));
        assertEquals("orld!", P.readN(8));
        assertTrue(P.readN(8).isEmpty());
    }

    @Test
    void itReadsTenCharacters() {
        assertEquals("Hello, wor", P.readN(10));
        assertEquals("ld!", P.readN(10));
        assertTrue(P.readN(10).isEmpty());
    }
}
