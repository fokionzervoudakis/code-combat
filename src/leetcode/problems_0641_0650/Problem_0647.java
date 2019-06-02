package leetcode.problems_0641_0650;

class Problem_0647 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^3)
     <li>space_worst=O(1)
     </ul>

     @param str the target string
     @return the number of palindromic substrings in {@code str}
     */
    int countSubstrings(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) { // O(n)
            for (int j = i; j < str.length(); j++) { // O(n)
                if (isPalindrome(str, i, j)) { // O(n/2)
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPalindrome(String str, int i, int j) {
        while (i < j) { // O(n)
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
