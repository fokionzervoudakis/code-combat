package dailycodingproblem.problems_001_010;

import annotation.DataStructure;
import annotation.DataStructure.Type;

/**
 Problem #8 [Easy] - Google
 */
@DataStructure(Type.TREE)
class Problem_008 {
    class It {
        int countUnival(Node n) {
            return helper(n).count;
        }

        Tuple helper(Node n) {
            if (n == null) {
                return new Tuple(0, true);
            }

            var c1 = helper(n.l);
            var c2 = helper(n.r);

            var isUnival = true;
            if (!c1.isUnival || !c2.isUnival) isUnival = false;
            if (n.l != null && n.l.val != n.val) isUnival = false;
            if (n.r != null && n.r.val != n.val) isUnival = false;

            int count = c1.count + c2.count;
            if (isUnival) {
                count++;
            }

            return new Tuple(count, isUnival);
        }

        class Tuple {
            int count;
            boolean isUnival;

            Tuple(int count, boolean isUnival) {
                this.count = count;
                this.isUnival = isUnival;
            }
        }
    }

    class Rec {
        int countUnival(Node n) {
            if (n == null) {
                return 0;
            }
            var count = countUnival(n.l) + countUnival(n.r);
            if (isUnival(n)) {
                count++;
            }
            return count;
        }

        boolean isUnival(Node n) {
            if (n == null) return true;
            if (n.l != null && n.val != n.l.val) return false;
            if (n.r != null && n.val != n.r.val) return false;
            return isUnival(n.l) && isUnival(n.r);
        }
    }

    static class Node {
        int val;

        Node l, r;

        Node(int val) {
            this.val = val;
        }
    }
}
