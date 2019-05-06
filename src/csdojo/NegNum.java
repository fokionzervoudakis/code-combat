package csdojo;

class NegNum {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(m+n)
     <li>space_worst=O(1)
     </ul>

     @param M a row- and column-wise sorted integer matrix
     @return the number of negative integers in {@code M}
     */
    int count(int[][] M) {
        int count = 0;
        int i = 0, j = M[0].length - 1;
        while (i < M.length && j >= 0) { // O(m+n)
            if (M[i][j] < 0) {
                count += j + 1;
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
