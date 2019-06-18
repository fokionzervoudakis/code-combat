package dailycodingproblem.problems_091_100;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class Test_092 {
    private Problem_092 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_092();
    }

    @Test
    void itSortsCoursesWithZeroPrerequisites() {
        var M = new LinkedHashMap<String, List<String>>() {{
            put("CSC100", new ArrayList<>());
            put("CSC200", new ArrayList<>());
            put("CSC300", new ArrayList<>());
        }};

        var expected = "[CSC100, CSC200, CSC300]";
        var actual = P.dfs(M).toString();

        assertEquals(expected, actual);
    }

    @Test
    void itSortsCoursesWithLinearDependencies() {
        var M = new LinkedHashMap<String, List<String>>() {{
            put("CSC300", new ArrayList<>() {{
                add("CSC100");
                add("CSC200");
            }});
            put("CSC200", new ArrayList<>() {{
                add("CSC100");
            }});
            put("CSC100", new ArrayList<>());
        }};

        var expected = "[CSC100, CSC200, CSC300]";
        var actual = P.dfs(M).toString();

        assertEquals(expected, actual);
    }

    @Test
    void itSortsCoursesWithTriangularDependencies() {
        var M = new LinkedHashMap<String, List<String>>() {{
            put("CSC400", new ArrayList<>() {{
                add("CSC200");
            }});
            put("CSC300", new ArrayList<>() {{
                add("CSC100");
                add("CSC200");
            }});
            put("CSC200", new ArrayList<>() {{
                add("CSC100");
            }});
            put("CSC100", new ArrayList<>());
        }};

        var expected = "[CSC100, CSC200, CSC400, CSC300]";
        var actual = P.dfs(M).toString();

        assertEquals(expected, actual);
    }

    @Test
    void itFailsWithCircularDependencies() {
        var M = new LinkedHashMap<String, List<String>>() {{
            put("CSC400", new ArrayList<>() {{
                add("CSC300");
            }});
            put("CSC300", new ArrayList<>() {{
                add("CSC100");
                add("CSC200");
            }});
            put("CSC200", new ArrayList<>() {{
                add("CSC100");
            }});
            put("CSC100", new ArrayList<>() {{
                add("CSC400");
            }});
        }};

        try {
            P.dfs(M);
            fail(new Throwable());
        } catch (Exception ignored) {
        }
    }
}
