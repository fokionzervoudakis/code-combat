package dailycodingproblem.problems_021_030;

import annotation.pattern.Greedy;

import java.util.Set;

/**
 Problem #22 [Medium] - Microsoft
 <p>{@link com.blockchain.WordSearch.Rec}
 */
public class Problem_022 {
    @Greedy
    String search(String in, Set<String> dict) {
        var out = "";
        var b = false;
        for (var i = 0; i < in.length(); i++) {
            out += in.charAt(i);
            if (dict.contains(out)) {
                if (i == in.length() - 1) {
                    b = true;
                    break;
                } else {
                    var tmp = search(in.substring(i + 1), dict);
                    if (!tmp.isEmpty()) {
                        out += ' ' + tmp;
                        b = true;
                        break;
                    }
                }
            }
        }
        return b ? out : "";
    }
}
