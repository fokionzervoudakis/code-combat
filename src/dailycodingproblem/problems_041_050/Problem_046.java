package dailycodingproblem.problems_041_050;

import annotation.pattern.BruteForce;

/**
 Problem #46 [Hard] - Amazon
 */
class Problem_046 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^3)
     <li>space_worst=O(1)
     </ul>

     @param str the target string
     @return the longest palindromic contiguous substring of {@code A}
     */
    @BruteForce
    String maxPalindrome1(String str) {
        int n = str.length();
        if (n < 2) {
            return str;
        }
        String pal = null;
        for (var i = 1; i < n; i++) { // O(n)
            for (var j = 0; j < n - i + 1; j++) { // O(n)
                var sub = str.substring(j, j + i);
                if (isPalindrome(sub)) { // O(n/2)
                    if (pal == null || sub.length() > pal.length()) {
                        pal = sub;
                    }
                }
            }
        }
        return pal;
    }

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^2)
     <li>space_worst=O(n)
     </ul>

     @param str the target string
     @return the longest palindromic contiguous substring of {@code A}
     */
    String maxPalindrome2(String str) {
        if (str.isEmpty() || isPalindrome(str)) { // O(n/2)
            return str;
        } else {
            var s1 = maxPalindrome2(str.substring(1)); // O(N)
            var s2 = maxPalindrome2(str.substring(0, str.length() - 1)); // O(N)
            return s1.length() > s2.length() ? s1 : s2;
        }
    }

    private boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) { // O(n/2)
            if (str.charAt(l++) != str.charAt(r--)) {
                return false;
            }
        }
        return true;
    }
}
