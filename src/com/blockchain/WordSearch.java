package com.blockchain;

import annotation.DynamicProgramming;
import annotation.Pattern;
import annotation.Pattern.Type;

import java.util.Set;

import static annotation.DynamicProgramming.Type.TABULATION;

public class WordSearch {
    /**
     This solution does not handle words/sentences with many possible
     reconstructions (for example, ex, exam, and example).
     */
    class Naive {
        String search(String in, Set<String> dict) {
            String tmp = "", out = "";
            for (var c : in.toCharArray()) {
                tmp += c;
                if (dict.contains(tmp)) {
                    if (!out.isEmpty()) {
                        out += ' ';
                    }
                    out += tmp;
                    tmp = "";
                }
            }
            return out;
        }
    }

    /**
     This solution cannot be optimized with dynamic programming because the
     recursion does not revisit overlapping sub-problems.
     <p>{@link dailycodingproblem.problems_021_030.Problem_022}
     */
    public class Rec {
        @Pattern(Type.GREEDY)
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

    @DynamicProgramming(TABULATION)
    class Tab {
        String search(String in, Set<String> dict) {
            var n = in.length();
            var A = new boolean[n + 1];
            A[0] = true;
            var out = "";
            for (var end = 0; end <= n; end++) {
                for (var start = end; start >= 0; start--) {
                    if (!A[start]) {
                        continue;
                    }
                    var word = in.substring(start, end);
                    if (dict.contains(word)) {
                        A[end] = true;
                        out += word + ' ';
                        break;
                    }
                }
            }
            return out.trim();
        }
    }
}
