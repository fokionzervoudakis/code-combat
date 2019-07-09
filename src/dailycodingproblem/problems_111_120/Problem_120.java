package dailycodingproblem.problems_111_120;

/**
 Problem #120 [Medium] - Microsoft
 */
class Problem_120 {
    private static Singleton first, second;

    private static int n = 0;

    static Singleton getInstance() {
        if (n++ % 2 == 0) {
            if (first == null) {
                first = new Singleton("first");
            }
            return first;
        } else {
            if (second == null) {
                second = new Singleton("second");
            }
            return second;
        }
    }

    static class Singleton {
        String str;

        Singleton(String str) {
            this.str = str;
        }

        @Override
        public String toString() {
            return str;
        }
    }
}
