package interviewcake.section_07;

class Problem_03 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param str a string
     @param n the position of an opening parenthesis
     @return the position of the corresponding closing parenthesis if it exists
     */
    int getClosing(String str, int n) {
        int m = 0;
        for (int i = n; i < str.length(); i++) { // O(n)
            char c = str.charAt(i);
            if (c == '(') {
                m++;
            } else {
                m--;
                if (m == 0) {
                    return i;
                }
            }
        }
        throw new RuntimeException();
    }
}
