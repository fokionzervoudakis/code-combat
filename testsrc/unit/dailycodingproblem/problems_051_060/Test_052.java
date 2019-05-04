package dailycodingproblem.problems_051_060;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class Test_052 {
    private Problem_052.Lru<String, Integer> lru;

    @BeforeEach
    void beforeEach() {
        lru = new Problem_052().new Lru<>(3);
    }

    @Test
    void itSetsKeyValuePairs() {
        lru.set("a", 1);
        lru.set("b", 2);
        lru.set("c", 3);
        assertEquals(1, lru.get("a").intValue());
        assertEquals(2, lru.get("b").intValue());
        assertEquals(3, lru.get("c").intValue());
    }

    @Test
    void itEvictsTheLeastRecentlyUsedKeyValuePairs() {
        lru.set("a", 1);
        lru.set("b", 2);
        lru.set("c", 3);
        lru.set("d", 4);
        lru.set("e", 5);
        assertNull(lru.get("a"));
        assertNull(lru.get("b"));
        assertEquals(3, lru.get("c").intValue());
        assertEquals(4, lru.get("d").intValue());
        assertEquals(5, lru.get("e").intValue());
    }
}
