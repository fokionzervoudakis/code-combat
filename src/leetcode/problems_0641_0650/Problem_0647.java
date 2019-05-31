package leetcode.problems_0641_0650;

class Problem_0647 {
    int countSubstrings(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (isPalindrome(str, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPalindrome(String str, int i, int j) {
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
