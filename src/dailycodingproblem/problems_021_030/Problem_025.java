package dailycodingproblem.problems_021_030;

/**
 Problem #25 [Hard] - Facebook
 */
class Problem_025 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(2^n)
     <li>space_worst=O(n)
     </ul>

     @param s a string
     @param p a regex pattern
     @return true if {@code s} matches {@code p}, else false
     */
    boolean match(String s, String p) {
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        var c = p.charAt(0);

        // The first character will not be a wildcard.
        var b = !s.isEmpty() && (c == '.' || c == s.charAt(0));

        // If the second character is a wildcard...
        if (p.length() >= 2 && p.charAt(1) == '*') {
            return match(s, p.substring(2)) // then the regex consumes either zero characters...
                    || (b && match(s.substring(1), p)); // or one character,
        } else {
            // else the regex consumes one character.
            return b && match(s.substring(1), p.substring(1));
        }
    }
}
