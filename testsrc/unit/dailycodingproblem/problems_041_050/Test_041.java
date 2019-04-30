package dailycodingproblem.problems_041_050;

import dailycodingproblem.problems_041_050.Problem_041.Flight;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_041 {
    private Problem_041 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_041();
    }

    @Test
    void itReturnsTheItineraryWhenItExists() {
        var L = new ArrayList<Flight>() {{
            add(new Flight("SFO", "HKO"));
            add(new Flight("YYZ", "SFO"));
            add(new Flight("YUL", "YYZ"));
            add(new Flight("HKO", "ORD"));
        }};
        var expected = "[YUL, YYZ, SFO, HKO, ORD]";
        var actual = P.getItinerary(L, "YUL").toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsNullWhenTheItineraryDoesNotExist() {
        var L = new ArrayList<Flight>() {{
            add(new Flight("SFO", "COM"));
            add(new Flight("COM", "YYZ"));
        }};
        assertNull(P.getItinerary(L, "YUL"));
    }

    @Test
    void itReturnsTheLexicographicallySmallestItinerary() {
        var L = new ArrayList<Flight>() {{
            add(new Flight("A", "B"));
            add(new Flight("A", "C"));
            add(new Flight("B", "C"));
            add(new Flight("C", "A"));
        }};
        var expected = "[A, B, C, A, C]";
        var actual = P.getItinerary(L, "A").toString();
        assertEquals(expected, actual);
    }
}
