package dailycodingproblem.problems_131_140;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 Problem #132 [Easy] - Riot Games
 */
class Problem_132 {
    static class HitCounter {
        private final Map<Integer, Integer> M = new HashMap<>();

        void record(int n) {
            M.put(n, M.size());
        }

        int total() {
            return M.size();
        }

        int range(int low, int hi) {
            return M.get(hi) - M.get(low);
        }
    }

    public static void main(String[] args) {
        var counter = new HitCounter();
        Integer low = null, hi = null;
        var R = new Random();
        for (int i = 0; i < 10000; i++) {
            counter.record(i);
            if (R.nextDouble() < 0.001) {
                if (low == null) {
                    low = i;
                } else {
                    hi = rand(R, low, i);
                }
                if (hi != null) {
                    var n = counter.range(low, hi);
                    System.out.println(String.format("%s total requests.", counter.total()));
                    System.out.println(String.format("%s requests between %s and %s.", n, low, hi));
                    System.out.println();
                    low = null;
                    hi = null;
                }
            }
        }
    }

    private static int rand(Random R, int min, int max) {
        return R.nextInt((max - min) + 1) + min;
    }
}
