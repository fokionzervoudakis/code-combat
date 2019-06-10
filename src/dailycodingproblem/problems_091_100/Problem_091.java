package dailycodingproblem.problems_091_100;

import java.util.ArrayList;

/**
 Problem #91 [Easy] - Dropbox
 */
class Problem_091 {
    @FunctionalInterface
    interface Foo {
        int call();
    }

    public static void main(String[] args) {
        var L = new ArrayList<Foo>();
        for (int i = 0; i < 10; i++) {
            final int j = i;
            L.add(() -> j);
        }
        for (Foo f : L) {
            System.out.println(f.call());
        }
    }
}
