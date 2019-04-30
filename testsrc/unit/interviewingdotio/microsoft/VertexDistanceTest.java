package interviewingdotio.microsoft;

import com.google.common.collect.ImmutableList;
import interviewingdotio.microsoft.VertexDistance.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VertexDistanceTest {
    private VertexDistance distance;
    private List<Point> L;
    private Point origin;

    @BeforeEach
    void beforeEach() {
        distance = new VertexDistance();
        L = ImmutableList.of(new Point(2, 2), new Point(3, 3), new Point(4, 4), new Point(5, 5));
        origin = new Point(1, 1);
    }

    @Test
    void itReturnsZeroElements() {
        var expected = "[]";
        var actual = distance.getClosest(L, origin, 0).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsOneElement() {
        var expected = "[2,2]";
        var actual = distance.getClosest(L, origin, 1).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsManyElements() {
        var expected = "[3,3, 2,2]";
        var actual = distance.getClosest(L, origin, 2).toString();
        assertEquals(expected, actual);
    }
}
