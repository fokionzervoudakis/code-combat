package dailycodingproblem.problems_041_050;

import java.util.ArrayList;
import java.util.List;

/**
 Problem #42 [Hard] - Google
 */
class Problem_042 {
    List<Integer> sub(List<Integer> L, int k) {
        if (L.size() == 0) {
            return null;
        } else if (L.get(0) == k) {
            return L.subList(0, 1);
        } else {
            List<Integer> L2 = L.subList(1, L.size());
            List<Integer> L3 = sub(L2, k - L.get(0));
            if (L3 != null) {
                return new ArrayList<>() {{
                    add(L.get(0));
                    addAll(L3);
                }};
            } else {
                return sub(L2, k);
            }
        }
    }
}
