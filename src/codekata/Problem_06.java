package codekata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 Kata06: Anagrams
 <p>http://codekata.com/kata/kata06-anagrams/
 <p>Given a file containing one word per line, print out all the combinations of
 words that are anagrams; each line in the output contains all the words from the
 input that are anagrams of each other.
 */
class Problem_06 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(mn)
     <li>space_worst=O(n)
     </ul>
     */
    private static void run() {
        var len = 128;
        var A = new char[len];

        var M = new HashMap<String, List<String>>();

        int lines = 0, maxAnagrams = 0;

        String maxKey = null;

        var l = System.currentTimeMillis();

        // cat /usr/share/dict/words > words.txt
        try (var br = new BufferedReader(new FileReader("testdata/codekata/words.txt"))) {
            String line, sorted;
            while ((line = br.readLine()) != null) { // O(n)
                lines++;
                // counting sort...
                for (var c : line.toCharArray()) { // O(m)
                    A[downCase(c)]++;
                }
                for (var i = 1; i < len; i++) {
                    A[i] += A[i - 1];
                }
                var sb = new StringBuilder();
                for (var i = 0; i < len; i++) {
                    sb.append(A[i]);
                }
                sorted = sb.toString();
                // bookkeeping...
                var L = M.get(sorted);
                if (L == null) {
                    L = new ArrayList<>();
                    M.put(sorted, L);
                }
                L.add(line);
                if (maxAnagrams < L.size()) {
                    maxAnagrams = L.size();
                    maxKey = sorted;
                }
                // cleaning...
                for (var i = 0; i < len; i++) {
                    A[i] = 0;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("total time: " + (System.currentTimeMillis() - l) + " ms");
        System.out.println("total words: " + lines);
        System.out.println("total groups: " + M.size());
        System.out.println("max anagram count: " + M.get(maxKey));
    }

    private static char downCase(char c) {
        if (c == '-') return c;
        if (c >= 'A' && c <= 'Z') return (char) (c - 32);
        if (c >= 'a' && c <= 'z') return c;
        throw new RuntimeException("" + c);
    }

    public static void main(String[] args) {
        run();
    }
}
