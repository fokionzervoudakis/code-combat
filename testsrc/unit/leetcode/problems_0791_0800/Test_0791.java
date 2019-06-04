package leetcode.problems_0791_0800;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0791 {
    private Problem_0791 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_0791();
    }

    @Test
    void customSortStringTest1() {
        var expected = "cbad";
        var actual = P.customSortString("cba", "abcd");
        assertEquals(expected, actual);
    }

    @Test
    void customSortStringTest2() {
        var expected = "cbad";
        var actual = P.customSortString("cbafg", "abcd");
        assertEquals(expected, actual);
    }

    @Test
    void customSortStringTest3() {
        var expected = "hhhhhuucccwaaaaaaaaabbdddddeffffggggiijjjjkkkkllll" +
                "mmmmnnnoooopppqqqqqqqqqqqrsssttttttttvxxxxxyyzzzzz";
        var actual = P.customSortString("hucw",
                "utzoampdgkalexslxoqfkdjoczajxtuhqyxvlfatmptqdsochtdzgypsfkgqwbgqbcamdqnqztaqhqanirikahtmalzqjjxtqfnh");
        assertEquals(expected, actual);
    }
}
