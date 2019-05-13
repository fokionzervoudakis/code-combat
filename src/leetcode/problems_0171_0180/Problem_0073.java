package leetcode.problems_0171_0180;

import annotation.InPlace;

import java.util.Random;

class Problem_0073 {
    /**
     Sets the row and column of an element in {@code M} to zero if that element
     is zero.
     <p>Asymptotic analysis:
     <ul>
     <li>time_worst=O(m^2n+mn^2)
     <li>space_worst=O(1)
     </ul>

     @param M a integer matrix
     */
    @InPlace
    void setZeroes(int[][] M) {
        int flag = getFlag(M);
        int m = M.length, n = M[0].length;
        for (int i = 0; i < m; i++) { // O(m)
            for (int j = 0; j < n; j++) { // O(n)
                if (M[i][j] == 0) {
                    for (int k = 0; k < m; k++) { // O(m)
                        M[k][j] = flag;
                    }
                    for (int k = 0; k < n; k++) { // O(n)
                        M[i][k] = flag;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) { // O(m)
            for (int j = 0; j < n; j++) { // O(n)
                if (M[i][j] == flag) {
                    M[i][j] = 0;
                }
            }
        }
    }

    private int getFlag(int[][] M) {
        Random R = new Random();
        int flag = R.nextInt();
        outer:
        while (true) {
            for (int[] A : M) { // O(m)
                for (int n : A) { // O(n)
                    if (n == flag) {
                        flag = R.nextInt();
                        continue outer;
                    }
                }
            }
            return flag;
        }
    }
}
