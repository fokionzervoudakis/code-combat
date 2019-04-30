package interviewcake.section_05;

import interviewcake.section_05.Problem_04.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Test_04 {
    private Problem_04 P;
    private String[] colors;

    @BeforeEach
    void beforeEach() {
        P = new Problem_04();
        colors = new String[] { "red", "green", "blue", "orange", "yellow", "white" };
    }

    @Test
    void itColorsALinearGraph() {
        var n1 = new Vertex("A");
        var n2 = new Vertex("B");
        var n3 = new Vertex("C");
        var n4 = new Vertex("D");

        n1.neighbors.add(n2);

        n2.neighbors.add(n1);
        n2.neighbors.add(n3);

        n3.neighbors.add(n2);
        n3.neighbors.add(n4);

        n4.neighbors.add(n3);

        var graph = new Vertex[] { n1, n2, n3, n4 };

        P.colorGraph(graph, colors);

        //@formatter:off
        var expected =
                "[" +
                    "A:red=[B:green], " +
                    "B:green=[A:red, C:red], " +
                    "C:red=[B:green, D:green], " +
                    "D:green=[C:red]" +
                "]";
        //@formatter:on

        var actual = Arrays.toString(graph);

        assertEquals(expected, actual);
    }

    @Test
    void itColorsATwoDisjointGraphs() {
        var n1 = new Vertex("A");
        var n2 = new Vertex("B");
        var n3 = new Vertex("C");
        var n4 = new Vertex("D");

        n1.neighbors.add(n2);
        n2.neighbors.add(n1);

        n3.neighbors.add(n4);
        n4.neighbors.add(n3);

        var graph = new Vertex[] { n1, n2, n3, n4 };

        P.colorGraph(graph, colors);

        //@formatter:off
        var expected =
                "[" +
                    "A:red=[B:green], " +
                    "B:green=[A:red], " +
                    "C:red=[D:green], " +
                    "D:green=[C:red]" +
                "]";
        //@formatter:on

        var actual = Arrays.toString(graph);

        assertEquals(expected, actual);
    }

    @Test
    void itColorsATriangularGraph() {
        var n1 = new Vertex("A");
        var n2 = new Vertex("B");
        var n3 = new Vertex("C");

        n1.neighbors.add(n2);
        n1.neighbors.add(n3);

        n2.neighbors.add(n1);
        n2.neighbors.add(n3);

        n3.neighbors.add(n1);
        n3.neighbors.add(n2);

        var graph = new Vertex[] { n1, n2, n3 };

        P.colorGraph(graph, colors);

        //@formatter:off
        var expected =
                "[" +
                    "A:red=[B:green, C:blue], " +
                    "B:green=[A:red, C:blue], " +
                    "C:blue=[A:red, B:green]" +
                "]";
        //@formatter:on

        var actual = Arrays.toString(graph);

        assertEquals(expected, actual);
    }

    @Test
    void itColorsAnEnvelopeShapedGraph() {
        var n1 = new Vertex("A");
        var n2 = new Vertex("B");
        var n3 = new Vertex("C");
        var n4 = new Vertex("D");
        var n5 = new Vertex("E");

        n1.neighbors.add(n2);
        n1.neighbors.add(n3);

        n2.neighbors.add(n1);
        n2.neighbors.add(n3);
        n2.neighbors.add(n4);
        n2.neighbors.add(n5);

        n3.neighbors.add(n1);
        n3.neighbors.add(n2);
        n3.neighbors.add(n4);
        n3.neighbors.add(n5);

        n4.neighbors.add(n2);
        n4.neighbors.add(n3);
        n4.neighbors.add(n5);

        n5.neighbors.add(n2);
        n5.neighbors.add(n3);
        n5.neighbors.add(n4);

        var graph = new Vertex[] { n1, n2, n3, n4, n5 };

        P.colorGraph(graph, colors);

        //@formatter:off
        var expected =
                "[" +
                    "A:red=[B:green, C:blue], " +
                    "B:green=[A:red, C:blue, D:red, E:orange], " +
                    "C:blue=[A:red, B:green, D:red, E:orange], " +
                    "D:red=[B:green, C:blue, E:orange], " +
                    "E:orange=[B:green, C:blue, D:red]" +
                "]";
        //@formatter:on

        var actual = Arrays.toString(graph);

        assertEquals(expected, actual);
    }

    @Test
    void itFailsWhenTheGraphHasACycle() {
        var n1 = new Vertex("A");
        n1.neighbors.add(n1);
        try {
            P.colorGraph(new Vertex[] { n1 }, colors);
            fail(new Throwable());
        } catch (RuntimeException ignored) {
        }
    }
}
