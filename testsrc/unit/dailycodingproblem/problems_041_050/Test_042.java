package dailycodingproblem.problems_041_050;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_042 {
    private Problem_042 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_042();
    }

    @Test
    void itReturnsNullWithZeroNumbers() {
        assertNull(P.sub(new ArrayList<>(), 0));
    }

    @Nested
    class WhenTheListHasOneNumber {
        private List<Integer> L;

        @BeforeEach
        void beforeEach() {
            L = Collections.singletonList(1);
        }

        @Test
        void itReturnsTheElementIfItIsEqualToTheNumber() {
            var expected = "[1]";
            var actual = P.sub(L, 1).toString();
            assertEquals(expected, actual);
        }

        @Test
        void itReturnsNullIfTheElementIsNotEqualToTheNumber() {
            assertNull(P.sub(L, 2));
        }
    }

    @Nested
    class WhenTheArrayHasManyElements {
        private List<Integer> L;

        @BeforeEach
        void beforeEach() {
            L = Arrays.asList(12, 1, 61, 5, 9, 2);
        }

        @Test
        void itReturnsASubsetWithOneElementIfItIsEqualToTheNumber() {
            var expected = "[61]";
            var actual = P.sub(L, 61).toString();
            assertEquals(expected, actual);
        }

        @Test
        void itReturnsASubsetWithManyElementsThatAddUpToTheNumber() {
            var expected = "[12, 1, 9, 2]";
            var actual = P.sub(L, 24).toString();
            assertEquals(expected, actual);
        }
    }
}
