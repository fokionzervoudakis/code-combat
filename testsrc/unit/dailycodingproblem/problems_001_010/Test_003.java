package dailycodingproblem.problems_001_010;

import dailycodingproblem.problems_001_010.Problem_003.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_003 {
    private Problem_003 P;
    private Node N;

    @BeforeEach
    void beforeEach() {
        P = new Problem_003();
        N = new Node("root", new Node("left", new Node("left.left"), null), new Node("right"));
    }

    @Test
    void itSerializesABinaryTree() {
        var expected = "[root[left[left.left]][right]]";
        var actual = P.serialize(N);
        assertEquals(expected, actual);
    }

    @Test
    void itDeserializesASerializedBinaryTree() {
        var expected = "root[left[left.left[null][null]][null]][right[null][null]]";
        var actual = P.deserialize(P.serialize(N)).toString();
        assertEquals(expected, actual);
    }
}
