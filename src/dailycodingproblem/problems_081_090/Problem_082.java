package dailycodingproblem.problems_081_090;

/**
 Problem #81 [Easy] - Microsoft
 */
class Problem_082 {
    private String str, buffer = "";

    private int offset = 0;

    Problem_082(String str) {
        this.str = str;
    }

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param n a target length
     @return {@code n} characters from {@code str}
     */
    String readN(int n) {
        var sb = new StringBuilder();
        String tmp;
        while (sb.length() < n) { // O(n/7)
            if ((tmp = read7()).isEmpty()) {
                break;
            }
            sb.append(tmp); // O(7)
        }
        buffer += sb; // O(m+n)
        var end = Math.min(n, buffer.length());
        var out = buffer.substring(0, end); // O(n)
        buffer = buffer.substring(end); // O(n)
        return out;
    }

    String read7() {
        var end = Math.min(offset + 7, str.length());
        var tmp = str.substring(offset, end); // O(n)
        offset = end;
        return tmp;
    }
}
