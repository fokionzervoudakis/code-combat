package dailycodingproblem.problems_131_140;

import dailycodingproblem.problems_131_140.Problem_134.SparseArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_134 {
    @Test
    void sparseArrayTest() {
        var A = new int[] { 1, 0, 0, 0, 3, 0, 2 };

        var arr = new SparseArray(A, A.length);

        assertEquals("{0=1, 4=3, 6=2}", arr.toString());

        arr.set(2, 4);
        assertEquals(4, arr.get(2).intValue());

        arr.set(4, 1);
        assertEquals(1, arr.get(4).intValue());

        arr.set(0, 0);
        assertNull(arr.get(0));
    }
}
