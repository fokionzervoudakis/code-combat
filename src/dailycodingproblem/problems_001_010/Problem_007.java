package dailycodingproblem.problems_001_010;

/**
 Problem #7 [Medium] - Facebook
 */
class Problem_007 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param str a string representation of a <em>valid</em> encoded message
     @return the number of ways that {@code str} can be decoded given the mapping
     a = 1, b = 2, ... z = 26
     */
    int getMsgCount(String str) {
        var len = str.length();
        int n;
        if (len == 1) {
            n = 1;
        } else if (len == 2) {
            n = 1 + isChar(str);
        } else {
            n = getMsgCount(str.substring(1)); // O(n)
            if (isChar(str.substring(0, 2)) == 1) {
                n += getMsgCount(str.substring(2)); // O(n)
            }
        }
        return n;
    }

    private int isChar(String str) {
        var n = Integer.parseInt(str);
        return (n >= 1 && n <= 26) ? 1 : 0;
    }
}
