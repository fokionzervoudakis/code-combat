package dailycodingproblem.problems_051_060;

import java.util.ArrayList;
import java.util.List;

/**
 Problem #57 [Medium] - Amazon
 <p>https://android.googlesource.com/platform/dalvik.git/+/android-4.2.2_r1/vm/native/java_lang_System.cpp
 */
class Problem_057 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>

     @param str the target string
     @param k the target length
     @return a list of strings with length less than or equal to {@code k}
     comprising in from {@code str}
     */
    List<String> breakUp(String str, int k) {
        var A = str.split(" ");
        var L = new ArrayList<String>();
        var sb = new StringBuilder();
        int i = 0, n = 0;
        while (i < A.length) { // O(n)
            var word = A[i];
            var len = word.length();
            if (len > k) {
                return null;
            }
            if (len + n <= k) {
                if (n > 0) {
                    sb.append(' ');
                }
                sb.append(word); // O(1)
                n += len + 1;
                i++;
            } else if (sb.length() > 0) {
                L.add(sb.toString()); // O(1)
                sb = new StringBuilder();
                n = 0;
            }
        }
        if (sb.length() > 0) {
            L.add(sb.toString()); // O(1)
        }
        return L;
    }
}
