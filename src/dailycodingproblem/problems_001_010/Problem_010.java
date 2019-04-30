package dailycodingproblem.problems_001_010;

/**
 Problem #10 [Medium] - Apple
 */
class Problem_010 {
    @FunctionalInterface
    public interface F {
        String call();
    }

    String call(F f, int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return f.call();
    }
}
