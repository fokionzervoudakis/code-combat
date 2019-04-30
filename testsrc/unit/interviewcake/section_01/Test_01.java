package interviewcake.section_01;

import interviewcake.section_01.Problem_01.Meeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_01 {
    private Problem_01 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_01();
    }

    @Test
    void itMergesTwoOverlappingMeetings() {
        var L = new ArrayList<Meeting>() {{
            add(new Meeting(1, 3));
            add(new Meeting(2, 4));
        }};
        var expected = "[(1, 4)]";
        var actual = P.mergeRanges(L).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itMergesTwoSequentialMeetings() {
        var L = new ArrayList<Meeting>() {{
            add(new Meeting(5, 6));
            add(new Meeting(6, 8));
        }};
        var expected = "[(5, 8)]";
        var actual = P.mergeRanges(L).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itMergesSubsumedMeetings() {
        var L = new ArrayList<Meeting>() {{
            add(new Meeting(1, 8));
            add(new Meeting(2, 5));
        }};
        var expected = "[(1, 8)]";
        var actual = P.mergeRanges(L).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itDoesNotMergeMeetingsThatDoNotOverlap() {
        var L = new ArrayList<Meeting>() {{
            add(new Meeting(1, 3));
            add(new Meeting(4, 8));
        }};
        var expected = "[(1, 3), (4, 8)]";
        var actual = P.mergeRanges(L).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itMergesMultipleOverlappingMeetings() {
        var L = new ArrayList<Meeting>() {{
            add(new Meeting(1, 4));
            add(new Meeting(2, 5));
            add(new Meeting(5, 8));
        }};
        var expected = "[(1, 8)]";
        var actual = P.mergeRanges(L).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itMergesUnorderedMeetings() {
        var L = new ArrayList<Meeting>() {{
            add(new Meeting(5, 8));
            add(new Meeting(1, 4));
            add(new Meeting(6, 8));
        }};
        var expected = "[(1, 4), (5, 8)]";
        var actual = P.mergeRanges(L).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itMergesAllMeetings() {
        var L = new ArrayList<Meeting>() {{
            add(new Meeting(1, 10));
            add(new Meeting(2, 5));
            add(new Meeting(6, 8));
            add(new Meeting(9, 10));
            add(new Meeting(10, 12));
        }};
        var expected = "[(1, 12)]";
        var actual = P.mergeRanges(L).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itMergesManyMeetings() {
        var L = new ArrayList<Meeting>() {{
            add(new Meeting(0, 1));
            add(new Meeting(3, 5));
            add(new Meeting(4, 8));
            add(new Meeting(10, 12));
            add(new Meeting(9, 10));
        }};
        var expected = "[(0, 1), (3, 8), (9, 12)]";
        var actual = P.mergeRanges(L).toString();
        assertEquals(expected, actual);
    }
}
