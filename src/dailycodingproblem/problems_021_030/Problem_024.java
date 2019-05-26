package dailycodingproblem.problems_021_030;

/**
 Problem #24 [Medium] - Google
 <p>https://www.dailycodingproblem.com/blog/lockable-binary-trees/
 */
class Problem_024 {
    static class Node {
        Node p;

        boolean locked = false;

        boolean isLocked() {
            return (p == null) ? locked : locked && p.isLocked();
        }

        boolean lock() {
            if (p == null || p.isLocked()) {
                locked = true;
                return true;
            } else {
                return false;
            }
        }

        boolean unlock() {
            if (p == null || !p.isLocked()) {
                locked = false;
                return true;
            } else {
                return false;
            }
        }
    }
}
