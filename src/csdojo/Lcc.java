package csdojo;

class Lcc {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of characters
     @return the longest consecutive character in {@code A}
     */
    char getChar(char[] A) {
        char prev = '\0', longest = prev;
        int lMax = 0, gMax = lMax;
        for (char curr : A) { // O(n)
            if (prev == curr) {
                lMax++;
            } else {
                lMax = 1;
            }
            if (gMax < lMax) {
                gMax = lMax;
                longest = prev;
            }
            prev = curr;
        }
        return longest;
    }
}
