package dailycodingproblem.problems_031_040;

/**
 Problem #31 [Easy] - Google
 */
class Problem_031 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(3^n)
     <li>space_worst=O(n)
     </ul>

     @param s1 a string
     @param s2 another string
     @return the edit distance between {@code s1} and {@code s2}
     */
    int editDist(String s1, String s2) {
        if (s1.length() == 0) {
            return s2.length();
        } else if (s2.length() == 0) {
            return s1.length();
        } else {
            var cost = (s1.charAt(0) == s2.charAt(0)) ? 0 : 1;
            var a = editDist(s1.substring(1), s2) + 1;
            var b = editDist(s1, s2.substring(1)) + 1;
            var c = editDist(s1.substring(1), s2.substring(1)) + cost;
            return Math.min(Math.min(a, b), c);
        }
    }
}
