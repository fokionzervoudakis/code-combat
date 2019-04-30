package dailycodingproblem.problems_011_020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_016 {
    private Problem_016.OrderLog log;

    @BeforeEach
    void beforeEach() {
        log = new Problem_016().new OrderLog(4);
    }

    @Test
    void itAddsOrderIdsToTheLog() {
        log.record(1);
        log.record(2);

        var expected = "[1, 2]";
        var actual = log.toString();

        assertEquals(expected, actual);
    }

    @Test
    void itRetainsTheLastNOrderIds() {
        log.record(1);
        log.record(2);
        log.record(3);
        log.record(4);
        log.record(5);
        log.record(6);

        var expected = "[3, 4, 5, 6]";
        var actual = log.toString();

        assertEquals(expected, actual);
    }

    @Test
    void itReturnsTheIthLastElementFromTheEnd() {
        log.record(1);
        log.record(2);
        log.record(3);
        log.record(4);

        assertEquals(4, log.getLast(1));
        assertEquals(3, log.getLast(2));
        assertEquals(2, log.getLast(3));
        assertEquals(1, log.getLast(4));

        log.record(5);
        log.record(6);

        assertEquals(6, log.getLast(1));
        assertEquals(5, log.getLast(2));
    }
}
