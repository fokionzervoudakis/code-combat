package leetcode.problems_0390_0400;

import java.util.Stack;

class Problem_0394 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mn)
     <li>space_worst=O(n)
     </ul>

     @param str an encoded string
     @return the decoded version of {@code str}
     */
    String decodeString(String str) {
        Stack<String> S = new Stack<>();
        StringBuilder sb1 = new StringBuilder();
        String num = "";
        for (char c : str.toCharArray()) { // O(m)
            if (Character.isDigit(c)) {
                num += c;
            } else if (Character.isLetter(c)) {
                if (S.isEmpty()) {
                    sb1.append(c);
                } else {
                    S.push(c + "");
                }
            } else if (c == '[') {
                S.push(num);
                num = "";
            } else if (c == ']') {
                String curr;
                StringBuilder sb2 = new StringBuilder();
                int n;
                while (true) { // O(m)
                    curr = S.pop();
                    try {
                        n = Integer.valueOf(curr);
                        break;
                    } catch (NumberFormatException e) {
                        sb2.insert(0, curr);
                    }
                }
                curr = sb2.toString();
                sb2 = new StringBuilder();
                for (int i = 0; i < n; i++) { // O(n)
                    sb2.append(curr);
                }
                if (S.isEmpty()) {
                    sb1.append(sb2.toString());
                } else {
                    S.push(sb2.toString());
                }
            }
        }
        return sb1.toString();
    }
}
