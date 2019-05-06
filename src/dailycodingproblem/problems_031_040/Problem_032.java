package dailycodingproblem.problems_031_040;

/**
 Problem #32 [Hard] - Jane Street
 <p>
 https://www.dailycodingproblem.com/blog/how-to-find-arbitrage-opportunities-in-python/
 */
class Problem_032 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(n^3)
     <li>space_worst=O(n)
     </ul>

     @param M a table of currency exchange rates represented as a 2D array
     @return true if a sequence of trades starting with some amount A of any
     currency can yield some amount greater than A for that currency, else false
     */
    boolean arbitrage(double[][] M) {
        int m = M.length, n = M[0].length;

        for (var i = 0; i < m; i++) { // O(m)
            for (var j = 0; j < n; j++) { // O(n)
                // If currencies and exchange rates are modeled as a graph,
                // a weighted edge path a -> b -> c is profitable if: a * b * c > 1
                // Taking the negative log of each edge yields: -log(a * b * c) = -(log(a) + log(b) + log(c))
                // Because -log(x) < 0 if x > 1, a negative edge cycle represents a profitable edge path.
                M[i][j] = -Math.log(M[i][j]);
            }
        }

        var A = new double[n];
        A[0] = 0; // The source vertex in Bellman-Ford.

        for (var i = 0; i < n - 1; i++) { // O(n)
            for (var v = 0; v < n; v++) { // O(n)
                for (var w = 0; w < n; w++) { // O(n)
                    var d = A[v] + M[v][w];
                    if (A[w] > d) {
                        A[w] = d;
                    }
                }
            }
        }

        for (var v = 0; v < n; v++) { // O(n)
            for (var w = 0; w < n; w++) { // O(n)
                var d = A[v] + M[v][w];
                if (A[w] > d) {
                    return true;
                }
            }
        }

        return false;
    }
}
