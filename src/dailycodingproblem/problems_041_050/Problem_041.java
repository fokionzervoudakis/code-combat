package dailycodingproblem.problems_041_050;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

/**
 Problem #41 [Medium] - Facebook
 */
class Problem_041 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n log n)
     <li>space_worst=O(n)
     </ul>

     @param L1 an unordered list of flights
     @return the lexicographically smallest itinerary if it exists, else null
     */
    List<String> getItinerary(List<Flight> L1, String from) {
        var M = new HashMap<String, TreeSet<String>>();
        for (var F : L1) {
            if (!M.containsKey(F.from)) {
                M.put(F.from, new TreeSet<>());
            }
            M.get(F.from).add(F.to);
        }
        var L2 = new ArrayList<String>();
        while (M.containsKey(from)) {
            L2.add(from);
            var S = M.get(from);
            from = S.first();
            S.remove(from);
            if (S.isEmpty()) {
                M.remove(L2.get(L2.size() - 1));
            }
        }
        if (L2.isEmpty()) {
            return null;
        } else {
            L2.add(from);
            return L2;
        }
    }

    static class Flight {
        String from;
        String to;

        Flight(String from, String to) {
            this.from = from;
            this.to = to;
        }
    }
}
