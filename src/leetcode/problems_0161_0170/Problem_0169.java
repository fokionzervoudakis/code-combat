package leetcode.problems_0161_0170;

class Problem_0169 {
    /**
     Uses the Boyer-Moore majority vote algorithm to find the majority element in
     an array of integers
     <p>Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A a non-empty array of {@code n} integers containing a majority
     element that appears more than {@code n/2} times
     @return the majority element of {@code A}
     */
    int majorityElement(int[] A) {
        int i = 0;
        Integer m = null;
        for (int n : A) {
            if (i == 0) {
                m = n;
                i = 1;
            } else if (m == n) {
                i++;
            } else {
                i--;
            }
        }
        return m;
    }
}
