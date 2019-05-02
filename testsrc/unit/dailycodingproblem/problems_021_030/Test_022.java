package dailycodingproblem.problems_021_030;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_022 {
    private Problem_022 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_022();
    }

    @Test
    void itReturnsTheOnlyPossibleReconstruction() {
        var dict = new HashSet<String>() {{
            add("the");
            add("quick");
            add("brown");
            add("fox");
        }};
        var expected = "the quick brown fox";
        var actual = P.search("thequickbrownfox", dict);
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsAPossibleReconstruction() {
        var dict = new HashSet<String>() {{
            add("bed");
            add("bath");
            add("bedbath");
            add("and");
            add("beyond");
        }};
        var expected = "bed bath and beyond";
        var actual = P.search("bedbathandbeyond", dict);
        assertEquals(expected, actual);
    }
}
