package interviewcake.section_10;

import interviewcake.section_10.Problem_01.Rect;
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
    void overlapAlongBothAxesTest() {
        var expected = "(left: 5, bottom: 2, width: 2, height: 2)";
        var actual = P.findOverlap(new Rect(1, 1, 6, 3), new Rect(5, 2, 3, 6)).toString();
        assertEquals(expected, actual);
    }

    @Test
    void oneRectangleInsideAnotherTest() {
        var expected = "(left: 3, bottom: 3, width: 2, height: 2)";
        var actual = P.findOverlap(new Rect(1, 1, 6, 6), new Rect(3, 3, 2, 2)).toString();
        assertEquals(expected, actual);
    }

    @Test
    void bothRectanglesTheSameTest() {
        var expected = "(left: 2, bottom: 2, width: 4, height: 4)";
        var actual = P.findOverlap(new Rect(2, 2, 4, 4), new Rect(2, 2, 4, 4)).toString();
        assertEquals(expected, actual);
    }

    @Test
    void touchOnHorizontalEdgeTest() {
        var expected = "(left: 0, bottom: 0, width: 0, height: 0)";
        var actual = P.findOverlap(new Rect(1, 2, 3, 4), new Rect(2, 6, 2, 2)).toString();
        assertEquals(expected, actual);
    }

    @Test
    void touchOnVerticalEdgeTest() {
        var expected = "(left: 0, bottom: 0, width: 0, height: 0)";
        var actual = P.findOverlap(new Rect(1, 2, 3, 4), new Rect(4, 3, 2, 2)).toString();
        assertEquals(expected, actual);
    }

    @Test
    void touchAtCornerTest() {
        var expected = "(left: 0, bottom: 0, width: 0, height: 0)";
        var actual = P.findOverlap(new Rect(1, 1, 2, 2), new Rect(3, 3, 2, 2)).toString();
        assertEquals(expected, actual);
    }

    @Test
    void noOverlapTest() {
        var expected = "(left: 0, bottom: 0, width: 0, height: 0)";
        var actual = P.findOverlap(new Rect(1, 1, 2, 2), new Rect(4, 6, 3, 6)).toString();
        assertEquals(expected, actual);
    }
}
