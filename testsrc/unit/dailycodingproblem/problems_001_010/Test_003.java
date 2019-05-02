package dailycodingproblem.problems_001_010;

import dailycodingproblem.problems_001_010.Problem_003.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Test_003 {
    private Problem_003 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_003();
    }

    @Test
    void itSerializesAndDeserializesAnEmptyBinaryTree() {
        assertTrue(P.serialize(P.deserialize(P.serialize(null))).isEmpty());
    }

    @Test
    void itSerializesAndDeserializesABinaryTreeWithOneNode() {
        var N = new Node("root");
        var expected = "[root]";
        var actual = P.serialize(P.deserialize(P.serialize(N)));
        assertEquals(expected, actual);
    }

    @Test
    void itSerializesAndDeserializesABinaryTreeWithManyNodes() {
        var N = new Node("root", new Node("left", new Node("left.left"), null), new Node("right"));
        var expected = "[root[left[left.left]][right]]";
        var actual = P.serialize(P.deserialize(P.serialize(N)));
        assertEquals(expected, actual);
    }
}
