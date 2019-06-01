package leetcode.problems_1051_1060;

import annotation.Favorite;
import annotation.InPlace;
import annotation.PseudoRandom;

import java.util.Random;

class Problem_1054 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of integers that can be arranged so adjacent integers are
     never equal
     */
    @InPlace
    @PseudoRandom
    @Favorite
    void rearrangeBarCodes(int[] A) {
        shuffle(A);
        helper(A);
        reverse(A);
        helper(A);
    }

    //<editor-fold desc="Fisher-Yates shuffle">
    private void shuffle(int[] A) {
        Random R = new Random();
        for (int i = 0; i < A.length - 1; i++) { // O(n)
            swap(A, i, rand(R, i, A.length - 1));
        }
    }

    private int rand(Random R, int min, int max) {
        return R.nextInt((max - min) + 1) + min;
    }
    //</editor-fold>

    private void helper(int[] A) {
        int n = A.length;
        int i = 1;
        while (i < n) { // O(n)
            if (A[i] == A[i - 1]) {
                int j = i + 1;
                while (j < n) {
                    if (A[i] != A[j]) {
                        swap(A, i, j);
                        break;
                    }
                    j++;
                }
            }
            i++;
        }
    }

    private void reverse(int[] A) {
        int l = 0, r = A.length - 1;
        while (l < r) { // O(n/2)
            swap(A, l++, r--);
        }
    }

    private void swap(int[] A, int i, int j) {
        int n = A[i];
        A[i] = A[j];
        A[j] = n;
    }
}
