package interviewcake.section_01;

import annotation.InPlace;

class Problem_03 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_avg=O(n)
     <li>time_worst=O(n^2)
     <li>space_worst=O(1)
     </ul>

     @param A a character array
     */
    @InPlace
    void reverseWords(char[] A) {
        reverse(A, 0, A.length - 1); // O(n/2)
        int i = 0, j = 0;
        while (j < A.length) { // O(n)
            if (A[j] == ' ') {
                reverse(A, i, j - 1); // O(n/2)
                i = j + 1;
            }
            j++;
        }
        reverse(A, i, j - 1); // O(n/2)
    }

    private void reverse(char[] A, int l, int r) {
        while (l < r) {
            char c = A[l];
            A[l] = A[r];
            A[r] = c;
            l++;
            r--;
        }
    }
}
