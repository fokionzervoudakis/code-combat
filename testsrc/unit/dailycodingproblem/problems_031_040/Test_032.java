package dailycodingproblem.problems_031_040;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_032 {
    private Problem_032 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_032();
    }

    @Test
    void itReturnsTrueWhenArbitrageIsProfitable() {
        assertTrue(P.arbitrage(new double[][] { { 1, 2 }, { 2, 1 } }));
    }

    @Test
    void itReturnsFalseWhenArbitrageIsNotProfitable() {
        assertFalse(P.arbitrage(new double[][] { { 1, 1 }, { 1, 1 } }));
    }
}
