package dailycodingproblem.problems_021_030;

/**
 Problem #29 [Easy] - Amazon
 */
class Problem_029 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param str the target string
     @return the run-length encoding/compression of {@code str}
     */
    String encode1(String str) {
        var out = new StringBuilder();
        var curr = '\0';
        var n = 0;
        for (var c : str.toCharArray()) { // O(n)
            if (c != curr) {
                if (n > 0) {
                    out.append((n == 1) ? curr : n + "" + curr);
                }
                curr = c;
                n = 1;
            } else {
                n++;
            }
        }
        if (n > 0) {
            out.append((n == 1) ? curr : n + "" + curr);
        }
        return out.toString();
    }

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param str the target string
     @return the run-length encoding/compression of {@code str}
     */
    String encode2(String str) {
        var sb = new StringBuilder();
        for (var i = 0; i < str.length(); i++) { // O(n)
            var n = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                n++;
                i++;
            }
            if (n > 1) {
                sb.append(n);
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mn)
     <li>space_worst=O(n)
     </ul>

     @param in a run-length encoded string
     @return the decoded/decompressed version of {@code in}
     */
    String decode(String in) {
        var num = new StringBuilder();
        var out = new StringBuilder();
        for (var c : in.toCharArray()) { // O(m)
            if (c >= '0' && c <= '9') {
                num.append(c);
            } else {
                if (num.length() == 0) {
                    out.append(c);
                } else {
                    for (var i = 0; i < Integer.valueOf(num.toString()); i++) { // O(n)
                        out.append(c);
                    }
                    num = new StringBuilder();
                }
            }
        }
        return out.toString();
    }
}
