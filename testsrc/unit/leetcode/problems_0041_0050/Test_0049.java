package leetcode.problems_0041_0050;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0049 {
    private Problem_0049 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0049();
    }

    @Test
    void itGroupsManyAnagrams() {
        var expected = "[[eat, tea, ate], [tan, nat], [bat]]";
        var actual = P.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }).toString();
        assertEquals(expected, actual);
    }
}
