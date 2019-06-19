package dailycodingproblem.problems_091_100;

import dailycodingproblem.problems_091_100.Problem_100.Point;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_100 {
    @Test
    void itReturnsTheMinNumberOfSteps() {
        var L = new ArrayList<Point>() {{
            add(new Point(0, 0));
            add(new Point(1, 1));
            add(new Point(1, 2));
        }};
        assertEquals(2, new Problem_100().minSteps(L));
    }
}
