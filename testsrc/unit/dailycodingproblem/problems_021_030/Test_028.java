package dailycodingproblem.problems_021_030;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_028 {
    private Problem_028 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_028();
    }

    @Test
    void itRightPadsOneWord() {
        var L = new ArrayList<String>();
        L.add("the");

        var expected = "[the             ]";
        var actual = P.getJustified(L, 16).toString();

        assertEquals(expected, actual);
    }

    @Test
    void itJustifiesTwoWords() {
        var L = new ArrayList<String>();
        L.add("the");
        L.add("quick");

        var expected = "[the        quick]";
        var actual = P.getJustified(L, 16).toString();

        assertEquals(expected, actual);
    }

    @Test
    void itJustifiesManyWords() {
        var L = new ArrayList<String>();
        L.add("the");
        L.add("quick");
        L.add("brown");
        L.add("fox");
        L.add("jumps");
        L.add("over");
        L.add("the");
        L.add("lazy");
        L.add("dog");

        var expected = "[the  quick brown, fox  jumps  over, the   lazy   dog]";
        var actual = P.getJustified(L, 16).toString();

        assertEquals(expected, actual);
    }
}
