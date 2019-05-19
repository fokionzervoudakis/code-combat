package leetcode.problems_1041_1050;

class Problem_1047 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n log n)
     <li>space_worst=O(n)
     </ul>

     @param str the target string
     @return a copy of {@code str} without adjacent duplicate characters
     */
    String removeDuplicates(String str) {
        boolean done = false;
        while (!done) { // O(log n)
            done = true;
            int i = 0;
            StringBuilder sb = new StringBuilder();
            while (i < str.length()) { // O(n)
                if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    done = false;
                    i += 2;
                } else {
                    sb.append(str.charAt(i++));
                }
            }
            str = sb.toString();
        }
        return str;
    }
}
