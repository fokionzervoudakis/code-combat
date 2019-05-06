package interviewcake.section_06;

import interviewcake.section_06.Problem_04.CakeType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Test_04 {
    private Problem_04 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_04();
    }

    @Test
    void itReturnsZeroWhenTheBagSizeIsZero() {
        var A = new CakeType[] { new CakeType(1, 2) };
        assertEquals(0, P.max(A, 0));
    }

    @Test
    void itReturnsTheMaxValueWithOneCakeType() {
        var A = new CakeType[] { new CakeType(2, 1) };
        assertEquals(4, P.max(A, 9));
    }

    @Test
    void itReturnsTheMaxValueWithTwoCakeTypes() {
        var A = new CakeType[] { new CakeType(4, 4), new CakeType(5, 5) };
        assertEquals(9, P.max(A, 9));
    }

    @Test
    void itReturnsTheMaxValueWithManyCakeTypes() {
        var A = new CakeType[] {
                new CakeType(2, 3), new CakeType(3, 6), new CakeType(5, 1),
                new CakeType(6, 1), new CakeType(7, 1), new CakeType(8, 1)
        };
        assertEquals(12, P.max(A, 7));
    }

    @Test
    void itReturnsTheMaxValueWhenItChoosesTheLessValuableCakeType() {
        var A = new CakeType[] { new CakeType(4, 4), new CakeType(5, 5) };
        assertEquals(12, P.max(A, 12));
    }

    @Test
    void itReturnsTheMaxValueWhenTheValueToWeightRatioIsNotOptimal() {
        var A = new CakeType[] { new CakeType(51, 52), new CakeType(50, 50) };
        assertEquals(100, P.max(A, 100));
    }

    @Test
    void itReturnsTheMaxValueWithACakeTypeThatCostsNothingAndWeighsNothing() {
        var A = new CakeType[] { new CakeType(0, 0), new CakeType(2, 1) };
        assertEquals(3, P.max(A, 7));
    }

    @Test
    void itFailsWithACakeTypeThatCostsSomethingAndWeighsNothing() {
        try {
            P.max(new CakeType[] { new CakeType(0, 5) }, 5);
            fail(new Throwable());
        } catch (RuntimeException ignored) {
        }
    }
}
