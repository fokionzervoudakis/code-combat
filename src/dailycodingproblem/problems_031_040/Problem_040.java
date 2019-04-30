package dailycodingproblem.problems_031_040;

/**
 Problem #38 [Hard] - Google
 */
class Problem_040 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n)
     <li>space_worst=O(1)
     </ul>

     @param A an array of integers where every integer occurs three times except
     for one integer, which only occurs once
     @return the unique integer in {@code A}
     */
    int getUnique(int[] A) {
        var unique = 0;

        // For each bit in a 32-bit integer,
        for (var i = 0; i < 32; i++) {
            // use left shift to access the bit at the ith index.
            // For example:
            // 1 << 0 = 0001 = 1
            // 1 << 1 = 0010 = 2
            // 1 << 2 = 0100 = 4
            // ...
            var x = (1 << i);

            var sum = 0;

            for (var n : A) {
                // Use bitwise AND to determine how many times the ith bit exists in the input array.
                // For example, if n=5:
                // 5 & 1 = 0101 & 0001 = 0001
                // 5 & 2 = 0101 & 0010 = 0000
                // 5 & 4 = 0101 & 0100 = 0100
                // ...
                if ((n & x) == x) {
                    sum++;
                }
            }

            // Bits that exist once in the input array belong to the unique integer.
            if (sum % 3 == 1) {
                unique |= x;
            }
        }

        return unique;
    }
}
