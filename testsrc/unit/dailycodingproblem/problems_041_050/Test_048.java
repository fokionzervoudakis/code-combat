package dailycodingproblem.problems_041_050;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_048 {
    private Problem_048 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_048();
    }

    @Test
    void itReconstructsAnEmptyTree() {
        assertNull(P.getTree(new char[0], new char[0]));
    }

    @Test
    void itReconstructsATrivialTree() {
        var pre = new char[] { 'a' };
        var in = new char[] { 'a' };
        var expected = "(null a null)";
        var actual = P.getTree(pre, in).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReconstructsASmallTree() {
        var pre = new char[] { 'a', 'b', 'c' };
        var in = new char[] { 'b', 'a', 'c' };
        var expected = "((null b null) a (null c null))";
        var actual = P.getTree(pre, in).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReconstructsABalancedTree() {
        var pre = new char[] { 'a', 'b', 'd', 'e', 'c', 'f', 'g' };
        var in = new char[] { 'd', 'b', 'e', 'a', 'f', 'c', 'g' };
        var expected = "(((null d null) b (null e null)) a ((null f null) c (null g null)))";
        var actual = P.getTree(pre, in).toString();
        assertEquals(expected, actual);
    }

    @Test
    void itReconstructsALeftHeavyTree() {
        var pre = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        var in = new char[] { 'g', 'f', 'e', 'd', 'c', 'b', 'a' };
        var expected = "(((((((null g null) f null) e null) d null) c null) b null) a null)";
        var actual = P.getTree(pre, in).toString();
        assertEquals(expected, actual);
    }
}
