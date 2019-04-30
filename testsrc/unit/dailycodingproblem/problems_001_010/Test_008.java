package dailycodingproblem.problems_001_010;

import dailycodingproblem.problems_001_010.Problem_008.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_008 {
    private Problem_008 P;
    private Node N;

    @BeforeEach
    void beforeEach() {
        P = new Problem_008();

        N = new Node(0);

        N.l = new Node(1);
        N.r = new Node(0);

        N.r.l = new Node(1);
        N.r.r = new Node(0);

        N.r.l.l = new Node(1);
        N.r.l.r = new Node(1);
    }

    @Test
    void itCountsUnivalTreesIteratively () {
        assertEquals(5, P.new It().countUnival(N));
    }

    @Test
    void itCountsUnivalTreesRecursively() {
        assertEquals(5, P.new Rec().countUnival(N));
    }
}
