package dailycodingproblem.problems_021_030;

import dailycodingproblem.problems_021_030.Problem_021.Lecture;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_021 {
    private Problem_021 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_021();
    }

    @Test
    void itReturnsZeroRoomsForZeroLectures() {
        assertEquals(0, P.getMinRooms(new Lecture[0]));
    }

    @Test
    void itReturnsOneRoomForOneLecture() {
        assertEquals(1, P.getMinRooms(new Lecture[] { new Lecture(1, 2) }));
    }

    @Test
    void itReturnsOneRoomForManyLecturesWithoutOverlaps() {
        var A = new Lecture[] { new Lecture(1, 2), new Lecture(3, 4) };
        assertEquals(1, P.getMinRooms(A));
    }

    @Test
    void itReturnsOneRoomForManyAdjacentLecturesWithoutOverlaps() {
        var A = new Lecture[] { new Lecture(1, 2), new Lecture(2, 3) };
        assertEquals(1, P.getMinRooms(A));
    }

    @Test
    void itReturnsManyRoomsForManyOverlappingLectures() {
        var A = new Lecture[] { new Lecture(1, 2), new Lecture(1, 2) };
        assertEquals(2, P.getMinRooms(A));
    }

    @Test
    void itReturnsManyRoomsForManyLectures() {
        var A = new Lecture[] { new Lecture(30, 75), new Lecture(0, 50), new Lecture(60, 150) };
        assertEquals(2, P.getMinRooms(A));
    }
}
