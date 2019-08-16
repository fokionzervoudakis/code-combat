package dailycodingproblem.problems_151_160;

/**
 Problem #153 [Hard]
 */
class Problem_153 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(n)
     </ul>
     */
    Integer distance(String phrase, String word1, String word2) {
        var A = phrase.split(" "); // O(n)
        int index1 = -1, index2 = -1;
        Integer dist = null;
        for (var i = 0; i < A.length; i++) { // O(n)
            String str = A[i];
            if (str.equals(word1)) {
                index1 = i;
            } else if (str.equals(word2)) {
                index2 = i;
            }
            if (index1 >= 0 && index2 >= 0) {
                if (index1 < index2) {
                    int tmpDist = index2 - index1 - 1;
                    if (dist == null) {
                        dist = tmpDist;
                    } else {
                        dist = Math.min(dist, tmpDist);
                        index1 = index2 = -1;
                    }
                } else {
                    index2 = -1;
                }
            }
        }
        return dist;
    }
}
