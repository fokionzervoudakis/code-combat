package com.fundingcircle;

public class RunLenEncoding {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param in a string
     @return the run-length encoding of {@code in}
     */
    String encode(String in) {
        var out = ""; // time_worst=O(n^2)
        var curr = '\0';
        var n = 0;
        for (var c : in.toCharArray()) {
            if (c != curr) {
                if (n > 0) {
                    out += (n == 1) ? curr : n + "" + curr;
                }
                curr = c;
                n = 1;
            } else {
                n++;
            }
        }
        if (n > 0) {
            out += (n == 1) ? curr : n + "" + curr;
        }
        return out;
    }

    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param in a run-length encoded string
     @return the decoded version of {@code in}
     */
    String decode(String in) {
        String out = "", num = ""; // time_worst=O(n^2)
        for (var c : in.toCharArray()) {
            if (c >= '0' && c <= '9') {
                num += c;
            } else {
                if (num.isEmpty()) {
                    out += c;
                } else {
                    for (var i = 0; i < Integer.valueOf(num); i++) {
                        out += c;
                    }
                    num = "";
                }
            }
        }
        return out;
    }
}
