package leetcode.problems_0541_0550;

import leetcode.problems_0541_0550.Problem_0543.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0543 {
    @Test
    void itCalculatesTheDiameterOfTheTree() {
        var N = new Node();

        N.l = new Node();
        N.r = new Node();

        N.l.l = new Node();
        N.l.r = new Node();

        assertEquals(3, new Problem_0543().diameter(N));
    }
}
