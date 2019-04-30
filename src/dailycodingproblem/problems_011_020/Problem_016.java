package dailycodingproblem.problems_011_020;

import java.util.ArrayList;
import java.util.List;

/**
 Problem #16 [Easy] - Twitter
 */
class Problem_016 {
    /**
     Asymptotic analysis:
     <ul>
     <li>space_worst=O(n)
     <li>record_worst=O(n)
     <li>getLast_worst=O(1)
     </ul>
     */
    class OrderLog {
        List<Integer> L = new ArrayList<>();

        int n;

        OrderLog(int n) {
            this.n = n;
        }

        void record(int id) {
            L.add(id);
            if (L.size() > n) {
                L.remove(0);
            }
        }

        int getLast(int i) {
            return L.get(n - i);
        }

        @Override
        public String toString() {
            return L.toString();
        }
    }
}
