package dailycodingproblem.problems_041_050;

import dailycodingproblem.problems_041_050.Problem_050.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_050 {
    private Problem_050 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_050();
    }

    @Test
    void itEvaluatesArithmeticExpressions() {
        var N = new Node('*');

        N.l = new Node('+');
        N.r = new Node('+');

        N.l.l = new Node('3');
        N.l.r = new Node('2');

        N.r.l = new Node('4');
        N.r.r = new Node('5');

        assertEquals(45, P.eval(N));
        assertEquals(5, P.eval(N.l));
        assertEquals(9, P.eval(N.r));
    }

    @Test
    void itEvaluatesLeafNodes() {
        assertEquals(3, P.eval(new Node('3')));
    }
}
