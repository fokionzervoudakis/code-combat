package dailycodingproblem.problems_061_070;

import dailycodingproblem.problems_061_070.Problem_068.Tuple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_068 {
    private Problem_068 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_068();
    }

    @Test
    void itReturnsZeroWithLessThanTwoBishops() {
        assertEquals(0, P.countAttacks(new ArrayList<>()));
        assertEquals(0, P.countAttacks(Collections.singletonList(new Tuple(0, 0))));
    }

    @Test
    void itCountsTheNumberOfAttackingBishops() {
        var L = Arrays.asList(new Tuple(0, 0), new Tuple(1, 2), new Tuple(2, 2), new Tuple(4, 0));
        assertEquals(2, P.countAttacks(L));
    }
}
