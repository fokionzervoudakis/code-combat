package leetcode.problems_1041_1050;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_1047 {
    private Problem_1047 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_1047();
    }

    @Test
    void itRemovesZeroCharactersWhenTheStringIsEmpty() {
        assertTrue(P.removeDuplicates("").isEmpty());
    }

    @Test
    void itRemovesZeroCharactersWhenTheStringDoesNotHaveDuplicateCharacters() {
        var expected = "abc";
        var actual = P.removeDuplicates("abc");
        assertEquals(expected, actual);
    }

    @Test
    void itRemovesOnePairOfAdjacentDuplicateCharacters() {
        var expected = "abc";
        var actual = P.removeDuplicates("abbbc");
        assertEquals(expected, actual);
    }

    @Test
    void itRemovesManyPairsOfAdjacentDuplicateCharacters() {
        var expected = "ca";
        var actual = P.removeDuplicates("abbaca");
        assertEquals(expected, actual);
    }
}
