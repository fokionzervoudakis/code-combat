package leetcode.problems_0001_0010;

import leetcode.problems_0001_0010.Problem_0002.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_0002 {
    @Test
    void itReturnsTheSumOfTwoIntegers() {
        var N1 = new Node(2);
        N1.next = new Node(4);
        N1.next.next = new Node(3);

        var N2 = new Node(5);
        N2.next = new Node(6);
        N2.next.next = new Node(4);

        var expected = "7 -> 0 -> 8 -> null";
        var actual = new Problem_0002().addTwoNumbers(N1, N2).toString();

        assertEquals(expected, actual);
    }
}
