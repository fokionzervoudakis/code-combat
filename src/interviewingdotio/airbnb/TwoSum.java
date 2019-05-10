package interviewingdotio.airbnb;

import annotation.BinarySearch;
import annotation.Bitwise;
import annotation.InPlace;
import annotation.pattern.HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 https://interviewing.io/recordings/Python-Airbnb-1
 */
class TwoSum {
    class Hashing {
        /**
         Asymptotic analysis:
         <ul>
         <li>time_worst=O(n)
         <li>space_worst=O(n)
         </ul>

         @param A an array of integers
         @param k an integer
         @return all unique pairs in {@code A} that sum up to {@code k}
         */
        @HashTable
        Map<Integer, Integer> getTwoSumPairs(int[] A, int k) {
            var S = new LinkedHashSet<Integer>(); // Order for test determinism
            for (var n : A) {
                S.add(n);
            }
            var M = new LinkedHashMap<Integer, Integer>(); // Order for test determinism
            for (var n : new ArrayList<>(S)) {
                var diff = k - n;
                var min = Math.min(n, diff);
                if (n != diff && S.contains(diff) && !M.containsKey(min)) {
                    M.put(min, Math.max(n, diff));
                }
            }
            return M;
        }
    }

    class BinSearch {
        /**
         Asymptotic analysis:
         <ul>
         <li>time_worst=O(n log n)
         <li>space_worst=O(1)
         </ul>

         @param A an array of integers
         @param k an integer
         @return all unique pairs in {@code A} that sum up to {@code k}
         */
        @BinarySearch
        @InPlace
        Map<Integer, Integer> getTwoSumPairs(int[] A, int k) {
            Arrays.sort(A);
            var M = new LinkedHashMap<Integer, Integer>(); // Order for test determinism
            for (var n : A) {
                var diff = k - n;
                var min = Math.min(n, diff);
                if (n != diff && contains(A, diff) && !M.containsKey(min)) {
                    M.put(min, Math.max(n, diff));
                }
            }
            return M;
        }

        @Bitwise
        private boolean contains(int[] A, int n) {
            int l = 0, r = A.length - 1;
            while (r >= l) {
                var mid = (l + r) >>> 1;
                var midVal = A[mid];
                if (midVal < n) {
                    l = mid + 1;
                } else if (midVal > n) {
                    r = mid - 1;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
