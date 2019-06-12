package leetcode.problems_0111_0120;

class Problem_0114 {
    // TODO test
    void flatten(Node N) {
        if (N == null) {
            return;
        }
        flatten(N.l);
        flatten(N.r);
        Node tmp = N.r;
        N.r = N.l;
        N.l = null;
        while (N.r != null) {
            N = N.r;
        }
        N.r = tmp;
    }

    static class Node {
        Node l, r;
    }
}
