package dailycodingproblem.problems_031_040;

/**
 Problem #34 [Medium] - Quora
 */
class Problem_034 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n log n)
     <li>space_worst=O(log n)
     </ul>

     @param str a string
     @return a palindrome of {@code str}
     */
    String minPalindrome(String str) {
        if (isPalindrome(str)) {
            return str;
        }
        var sb = new StringBuilder();
        for (var i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
            if (isPalindrome(sb + str)) {
                break;
            }
        }
        return sb + str;
    }

    private boolean isPalindrome(String str) {
        var n = str.length();
        for (var i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
