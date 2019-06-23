package dailycodingproblem.problems_101_110;

/**
 Problem #104 [Easy] - Google
 <p>{@link leetcode.problems_0231_0240.Problem_0234}
 */
public class Problem_104 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param N1 the head of a linked list
     @return true if {@code N1} is the head of a palindromic linked list, else
     false
     */
    boolean isPalindrome(Node N1) {
        // Find the length:
        var N2 = N1;
        var n = 0;
        while (N2 != null) { // O(n)
            N2 = N2.next;
            n++;
        }

        // Find the middle:
        N2 = N1;
        var i = 0;
        while (i < n / 2) { // O(n/2)
            N2 = N2.next;
            i++;
        }

        // Reverse the second part:
        N2 = reverseList(N2); // O(n/2)

        // Compare the two sub-lists:
        while (N1 != null && N2 != null) { // O(n)
            if (N1.val != N2.val) {
                return false;
            } else {
                N1 = N1.next;
                N2 = N2.next;
            }
        }

        return true;
    }

    private Node reverseList(Node hed) {
        if (hed == null) {
            return null;
        }
        Node prev = null;
        while (hed.next != null) {
            var tmp = hed.next;
            hed.next = prev;
            prev = hed;
            hed = tmp;
        }
        hed.next = prev;
        return hed;
    }

    static class Node {
        int val;

        Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
