package interviewcake.section_01;

import annotation.pattern.Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 {@link interviewcake.section_04.Problem_04}
 */
public class Problem_01 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n log n)
     <li>space_worst=O(n)
     </ul>

     @param L1 a list of meetings
     @return a list of (merged) meetings with non-overlapping time ranges
     */
    @Greedy
    List<Meeting> mergeRanges(List<Meeting> L1) {
        L1.sort(Comparator.comparingInt(m -> m.start)); // O(n log n)

        List<Meeting> L2 = new ArrayList<>();
        L2.add(L1.get(0));

        for (int i = 1; i < L1.size(); i++) { // O(n)
            Meeting prev = L2.get(L2.size() - 1), curr = L1.get(i);
            if (prev.end >= curr.start) {
                prev.end = Math.max(prev.end, curr.end);
            } else {
                L2.add(curr); // O(1)
            }
        }

        return L2;
    }

    static class Meeting {
        int start;
        int end;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", start, end);
        }
    }
}
