package interviewcake.section_08;

/**
 {@link interviewcake.section_04.Problem_02}
 <p>
 {@link interviewcake.section_05.Problem_06}
 */
public class Problem_05 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of length n+1 with integers in the range [1, n]
     @return a duplicate integer, which can be discovered by converting values in
     {@code A} to array indices
     */
    int findDuplicate(int[] A) {
        int i = 0;
        while (i < A.length) {
            if (A[i] == -1) {
                i++;
            } else {
                int j = i, curr = A[j];
                while (true) {
                    int prev = curr;
                    curr = A[j];
                    if (curr == -1) {
                        if (i != j) {
                            return prev;
                        } else {
                            break;
                        }
                    } else {
                        A[j] = -1;
                        j = curr - 1;
                    }
                }
            }
        }
        return 0;
    }
}
