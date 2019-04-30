package interviewcake.section_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_02 {
    @Test
    void itTracksTheMinMaxMeanAndModeValues() {
        var P = new Problem_02();

        P.insert(50);

        assertEquals(50, P.getMin());
        assertEquals(50, P.getMax());
        assertEquals(50.0, P.getMean());
        assertEquals(50, P.getMode());

        P.insert(80);

        assertEquals(50, P.getMin());
        assertEquals(80, P.getMax());
        assertEquals(65.0, P.getMean());
        assertEquals(50, P.getMode());

        P.insert(80);

        assertEquals(50, P.getMin());
        assertEquals(80, P.getMax());
        assertEquals(70.0, P.getMean());
        assertEquals(80, P.getMode());

        P.insert(30);

        assertEquals(30, P.getMin());
        assertEquals(80, P.getMax());
        assertEquals(60.0, P.getMean());
        assertEquals(80, P.getMode());
    }
}
