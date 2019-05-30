package dailycodingproblem.problems_071_080;

import dailycodingproblem.problems_071_080.Problem_080.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_080 {
    @Test
    void itCalculatesTheDiameterOfTheTree() {
        var N = new Node('a');

        N.l = new Node('b');
        N.r = new Node('c');

        N.l.l = new Node('d');

        assertEquals('d', new Problem_080().getDeepest(N).val);
    }
}
