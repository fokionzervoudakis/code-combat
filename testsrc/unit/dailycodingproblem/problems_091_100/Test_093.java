package dailycodingproblem.problems_091_100;

import dailycodingproblem.problems_091_100.Problem_093.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_093 {
    private Problem_093 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_093();
    }

    @Test
    void maxBstTest1() {
        assertEquals(1, P.maxBst(new Node(0)));
    }

    @Test
    void maxBstTest2() {
        var N = new Node(0);
        N.l = new Node(1);
        N.r = new Node(2);
        assertEquals(1, P.maxBst(N));
    }

    @Test
    void maxBstTest3() {
        var N = new Node(1);
        N.l = new Node(0);
        N.r = new Node(2);
        assertEquals(3, P.maxBst(N));
    }

    @Test
    void maxBstTest4() {
        var N = new Node(5);

        N.l = new Node(2);
        N.r = new Node(4);

        N.l.l = new Node(1);
        N.l.r = new Node(3);

        assertEquals(3, P.maxBst(N));
    }

    @Test
    void maxBstTest5() {
        var N = new Node(50);

        N.l = new Node(30);
        N.r = new Node(60);

        N.l.l = new Node(5);
        N.l.r = new Node(20);

        N.r.l = new Node(45);
        N.r.r = new Node(70);

        N.r.r.l = new Node(65);
        N.r.r.r = new Node(80);

        assertEquals(5, P.maxBst(N));
    }
}
