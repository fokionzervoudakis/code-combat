package interviewcake.section_04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_01 {
    private Problem_01 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_01();
    }

    @Test
    void itSearchesAnEmptyArray() {
        assertEquals(-1, P.findRotationPoint(new String[0]));
    }

    @Test
    void itSearchesASmallArray() {
        var A = new String[] { "cape", "cake" };
        assertEquals(1, P.findRotationPoint(A));
    }

    @Test
    void itSearchesAMediumArray() {
        var A = new String[] { "grape", "orange", "plum", "radish", "apple" };
        assertEquals(4, P.findRotationPoint(A));
    }

    @Test
    void itSearchesALargeArray() {
        var A = new String[] {
                "ptolemaic", "retrograde", "supplant", "undulate", "xenoepist",
                "asymptote", "babka", "banoffee", "engender", "karpatka", "othellolagkage"
        };
        assertEquals(5, P.findRotationPoint(A));
    }
}
