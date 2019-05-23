package leetcode.problems_0031_0040;

class Problem_0038 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mn)
     <li>space_worst=O(n)
     </ul>

     @param n an integer
     @return the {@code n}th term of the count-and-say sequence
     */
    String countAndSay(int n) {
        String out = "1";
        for (int i = 1; i < n; i++) { // O(m)
            StringBuilder sb = new StringBuilder();
            char c1 = '\0';
            int sum = 0;
            for (char c2 : out.toCharArray()) { // O(n)
                if (c1 == c2) {
                    sum++;
                } else {
                    if (c1 == '\0') {
                        sum++;
                    } else {
                        sb.append(sum).append(c1);
                        sum = 1;
                    }
                    c1 = c2;
                }
            }
            out = sb.append(sum).append(c1).toString();
        }
        return out;
    }
}
