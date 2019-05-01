package interviewcake.section_06;

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
    void itPermutesAStringWithZeroCharacters() {
        var expected = "[]";
        var actual = P.getPermutations("").toString();
        assertEquals(expected, actual);
    }

    @Test
    void itPermutesAStringWithOneCharacter() {
        var expected = "[a]";
        var actual = P.getPermutations("a").toString();
        assertEquals(expected, actual);
    }

    @Test
    void itPermutesAStringWithTwoCharacters() {
        var expected = "[ab, ba]";
        var actual = P.getPermutations("ab").toString();
        assertEquals(expected, actual);
    }

    @Test
    void itPermutesAStringWithManyCharacters() {
        var expected = "[abc, bac, cab, acb, bca, cba]";
        var actual = P.getPermutations("abc").toString();
        assertEquals(expected, actual);
    }
}
