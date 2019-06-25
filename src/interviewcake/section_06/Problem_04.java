package interviewcake.section_06;

/**
 {@link leetcode.problems_0321_0330.Problem_0322}
 */
public class Problem_04 {
    /**
     Asymptotic analysis:
     <ul>
     <li>time_worst=O(3^n)
     <li>space_worst=O(n)
     </ul>

     @param A an array of cake type objects
     @param size the max weight of a duffel bag
     @return the max value that can be obtained from items in {@code A} when
     total weight is less than or equal to {@code size}, and without upper bounds
     on the number of times an item may be selected (unbounded knapsack)
     */
    int max(CakeType[] A, int size) {
        return helper(A, 0, size);
    }

    private int helper(CakeType[] A, int i, int size) {
        if (i == A.length || size == 0) {
            return 0;
        } else if (A[i].weight == 0 && A[i].value != 0) {
            // Avoid infinity with cake types that cost something and weigh nothing.
            throw new RuntimeException();
        } else {
            int a = helper(A, i + 1, size);
            int b, c;
            if (size >= A[i].weight && A[i].value > 0) {
                b = helper(A, i, size - A[i].weight) + A[i].value;
                c = helper(A, i + 1, size - A[i].weight) + A[i].value;
            } else {
                b = 0;
                c = 0;
            }
            return Math.max(Math.max(a, b), c);
        }
    }

    static class CakeType {
        int weight;
        int value;

        CakeType(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
}
