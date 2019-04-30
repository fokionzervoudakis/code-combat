package interviewcake.section_01;

import annotation.InPlace;

class Problem_02 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A a character array
     */
    @InPlace
    void reverse(char[] A) {
        for (int i = 0; i < A.length / 2; i++) { // O(n/2)
            int j = A.length - i - 1;
            char c = A[i];
            A[i] = A[j];
            A[j] = c;
        }
    }
}
