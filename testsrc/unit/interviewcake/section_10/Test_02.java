package interviewcake.section_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_02 {
    @Test
    void itTracksTheMinMaxMeanAndModeValues() {
        var tracker = new Problem_02().new TempTracker();

        tracker.insert(50);

        assertEquals(50, tracker.getMin());
        assertEquals(50, tracker.getMax());
        assertEquals(50.0, tracker.getMean());
        assertEquals(50, tracker.getMode());

        tracker.insert(80);

        assertEquals(50, tracker.getMin());
        assertEquals(80, tracker.getMax());
        assertEquals(65.0, tracker.getMean());
        assertEquals(50, tracker.getMode());

        tracker.insert(80);

        assertEquals(50, tracker.getMin());
        assertEquals(80, tracker.getMax());
        assertEquals(70.0, tracker.getMean());
        assertEquals(80, tracker.getMode());

        tracker.insert(30);

        assertEquals(30, tracker.getMin());
        assertEquals(80, tracker.getMax());
        assertEquals(60.0, tracker.getMean());
        assertEquals(80, tracker.getMode());
    }
}
