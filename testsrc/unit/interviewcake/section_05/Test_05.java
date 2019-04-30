package interviewcake.section_05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

class Test_05 {
    private Problem_05 P;
    private Map<String, String[]> graph;

    @BeforeEach
    void beforeEach() {
        P = new Problem_05();
        graph = new HashMap<>() {
            {
                put("a", new String[] { "b", "c", "d" });
                put("b", new String[] { "a", "d" });
                put("c", new String[] { "a", "e" });
                put("d", new String[] { "a", "b" });
                put("e", new String[] { "c" });
                put("f", new String[] { "g" });
                put("g", new String[] { "f" });
            }
        };
    }

    @Test
    void itReturnsATwoHopPath_1() {
        var expected = "[a, c, e]";
        var actual = Arrays.toString(P.getPath(graph, "a", "e"));
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsATwoHopPath_2() {
        var expected = "[d, a, c]";
        var actual = Arrays.toString(P.getPath(graph, "d", "c"));
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsAOneHopPath_1() {
        var expected = "[a, c]";
        var actual = Arrays.toString(P.getPath(graph, "a", "c"));
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsAOneHopPath_2() {
        var expected = "[f, g]";
        var actual = Arrays.toString(P.getPath(graph, "f", "g"));
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsAOneHopPath_3() {
        var expected = "[g, f]";
        var actual = Arrays.toString(P.getPath(graph, "g", "f"));
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsAZeroHopPath() {
        var expected = "[a]";
        var actual = Arrays.toString(P.getPath(graph, "a", "a"));
        assertEquals(expected, actual);
    }

    @Test
    void itReturnsNullWhenAPathDoesNotExist() {
        assertNull(P.getPath(graph, "a", "f"));
    }

    @Test
    void itFailsWhenTheStartNodeDoesNotExist() {
        try {
            P.getPath(graph, "h", "a");
            fail(new Throwable());
        } catch (RuntimeException ignored) {
        }
    }

    @Test
    void itFailsWhenTheEndNodeDoesNotExist() {
        try {
            P.getPath(graph, "a", "h");
            fail(new Throwable());
        } catch (RuntimeException ignored) {
        }
    }
}
