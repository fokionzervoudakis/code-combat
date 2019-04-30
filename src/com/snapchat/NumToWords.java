package com.snapchat;

class NumToWords {
    private String[] A = new String[] {
            "",
            "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private String[] B = new String[] {
            "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    String getWords(int n) {
        return (n == 0) ? "Zero" : helper(n);
    }

    private String helper(int n) {
        var str = "";
        if (n < 20) {
            str = A[n];
        } else if (n < 100) {
            str = B[n / 10] + " " + helper(n % 10);
        } else if (n < 1000) {
            str = helper(n / 100) + " Hundred " + helper(n % 100);
        } else if (n < 1000000) {
            str = helper(n / 1000) + " Thousand " + helper(n % 1000);
        } else if (n < 1000000000) {
            str = helper(n / 1000000) + " Million " + helper(n % 1000000);
        } else {
            str = helper(n / 1000000000) + " Billion " + helper(n % 1000000000);
        }
        return str.trim();
    }
}
