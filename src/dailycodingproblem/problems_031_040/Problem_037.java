package dailycodingproblem.problems_031_040;

import java.util.ArrayList;
import java.util.List;

/**
 Problem #37 [Easy] - Google
 <p>{@link leetcode.problems_0071_0080.Problem_0078}
 */
public class Problem_037 {
    List<List<Integer>> L = new ArrayList<>();

    List<List<Integer>> generate(int[] A) {
        return generate(A, A.length);
    }

    private List<List<Integer>> generate(int[] A, int n) {
        if (n == 0) {
            L.add(new ArrayList<>());
        } else {
            int m = n - 1;
            L = generate(A, m);
            for (List<Integer> sub : new ArrayList<>(L)) {
                L.add(new ArrayList<>() {{
                    addAll(sub);
                    add(A[m]);
                }});
            }
        }
        return L;
    }
}
