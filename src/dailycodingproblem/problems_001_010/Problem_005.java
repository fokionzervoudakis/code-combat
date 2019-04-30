package dailycodingproblem.problems_001_010;

/**
 Problem #5 [Medium] - Jane Street
 */
class Problem_005 {
    @FunctionalInterface
    public interface F1 {
        int foo(int a, int b);
    }

    @FunctionalInterface
    public interface F2 {
        int foo(F1 f1);
    }

    F2 cons(int a, int b) {
        return (F1 f1) -> f1.foo(a, b);
    }

    int car(F2 f2) {
        return f2.foo((a, b) -> a);
    }

    int cdr(F2 f2) {
        return f2.foo((a, b) -> b);
    }
}
