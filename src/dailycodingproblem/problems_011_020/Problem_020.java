package dailycodingproblem.problems_011_020;

import annotation.DataStructure;
import annotation.DataStructure.Type;

/**
 Problem #20 [Easy] - Google
 */
@DataStructure(Type.LINKED_LIST)
class Problem_020 {
    Node intersection(Node n1, Node n2) {
        if (n1 == null || n2 == null) {
            return null;
        }

        var len1 = getLength(n1);
        var len2 = getLength(n2);

        Node tmp1, tmp2;

        if (len1 > len2) {
            tmp1 = n1;
            tmp2 = n2;
        } else {
            tmp1 = n2;
            tmp2 = n1;
        }

        for (int i = 0; i < Math.abs(len1 - len2); i++) {
            tmp1 = tmp1.next;
        }

        while (tmp1 != null && tmp2 != null) {
            if (tmp1 == tmp2) {
                return tmp1;
            } else {
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
            }
        }

        return null;
    }

    private int getLength(Node n) {
        var i = 0;
        while (n.next != null) {
            n = n.next;
            i++;
        }
        return i;
    }

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
