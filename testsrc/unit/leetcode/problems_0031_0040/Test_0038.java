package leetcode.problems_0031_0040;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0038 {
    @Test
    void itReturnsTheNthTermOfTheCountAndSaySequence() {
        var P = new Problem_0038();
        assertEquals("1", P.countAndSay(1));
        assertEquals("11", P.countAndSay(2));
        assertEquals("21", P.countAndSay(3));
        assertEquals("1211", P.countAndSay(4));
        assertEquals("111221", P.countAndSay(5));
    }
}
