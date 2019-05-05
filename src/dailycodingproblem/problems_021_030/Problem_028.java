package dailycodingproblem.problems_021_030;

import java.util.ArrayList;
import java.util.List;

/**
 Problem #28 [Medium] - Palantir
 */
class Problem_028 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mn)
     <li>space_worst=O(n)
     </ul>

     @param L a list of words
     @param k the desired length for a line of words
     @return a list of fully justified lines comprising the words in {@code L}
     */
    List<String> getJustified(List<String> L, int k) {
        var copy = new ArrayList<>(L);

        var lines = new ArrayList<ArrayList<String>>();
        var lengths = new ArrayList<Integer>();

        var line = new ArrayList<String>();
        var len = 0;

        while (!copy.isEmpty()) { // O(m)
            var word = copy.get(0); // O(1)
            if (len + line.size() + word.length() + 1 <= k) {
                line.add(copy.remove(0)); // O(n)
                len += word.length();
            } else {
                lines.add(line); // O(1)
                lengths.add(len); // O(1)
                line = new ArrayList<>();
                len = 0;
            }
        }

        lines.add(line);
        lengths.add(len);

        var out = new ArrayList<String>();

        for (int i = 0; i < lines.size(); i++) {
            line = lines.get(i);
            var size = line.size();
            var spaces = k - lengths.get(i);
            if (size == 1) {
                var A = makeSpaces(1, spaces);
                out.add(line.get(0) + printSpaces(A[0]));
            } else {
                var A = makeSpaces(size - 1, spaces);
                var sb = new StringBuilder();
                for (int j = 0; j < size; j++) {
                    sb.append(line.get(j));
                    if (j < size - 1) {
                        sb.append(printSpaces(A[j]));
                    }
                }
                out.add(sb.toString());
            }
        }

        return out;
    }

    private int[] makeSpaces(int m, int n) {
        var A = new int[m];
        int i = 0;
        while (n > 0) { // O(n)
            A[i]++;
            i = (i + 1) % m;
            n--;
        }
        return A;
    }

    private String printSpaces(int n) {
        return new String(new char[n]).replace('\0', ' '); // O(n)
    }
}
