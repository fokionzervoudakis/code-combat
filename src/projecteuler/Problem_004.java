package projecteuler;

/**
 * Problem 4 - largest palindrome product
 */
class Problem_004 {
    int maxPalindrome(int hi, int low) {
        int max = -1;
        for (int i = hi; i >= low; i--) {
            for (int j = i; j >= low; j--) {
                int prod = i * j;
                if (prod <= max) {
                    break;
                } else {
                    var s = prod + "";
                    if (s.equals(new StringBuilder(s).reverse().toString())) {
                        max = prod;
                    }
                }
            }
        }
        return max;
    }
}
