package dailycodingproblem.problems_011_020;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_014 {
    private Problem_014 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_014();
    }

    @Test
    void itEstimatesPiAccuratelyToZeroDecimalPlaces() {
        var df = new DecimalFormat("#");
        df.setRoundingMode(RoundingMode.FLOOR);
        assertEquals("3", df.format(P.pi(1000)));
    }

    @Test
    void itEstimatesPiAccuratelyToOneDecimalPlace() {
        var df = new DecimalFormat("#.#");
        df.setRoundingMode(RoundingMode.FLOOR);
        assertEquals("3.1", df.format(P.pi(100_000)));
    }

    @Ignore
    void itEstimatesPiAccuratelyToTwoDecimalPlaces() {
        var df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);
        assertEquals("3.14", df.format(P.pi(10_000_000)));
    }
}
