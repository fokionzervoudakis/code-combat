package interviewcake.section_12;

class Problem_01 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of n+1 numbers where every number in the range [1, n] is
     unique and one number is a duplicate
     @return the duplicate number in {@code A}
     */
    int findRepeat(int[] A) {
        int totalSum = 0;
        for (int n : A) {
            totalSum += n;
        }
        int m = A.length - 1;
        int triSum = ((m * m) + m) / 2;
        return totalSum - triSum;
    }
}
