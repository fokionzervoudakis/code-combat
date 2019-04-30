package projecteuler;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_008 {
    @Test
    void itCalculatesTheMaxProduct() throws Exception {
        var S = readLinesToString();
        var P = new Problem_008();
        assertEquals(5832, P.maxProduct(S, 4));
        assertEquals(23514624000L, P.maxProduct(S, 13));
    }

    private String readLinesToString() throws Exception {
        var L = FileUtils.readLines(new File("testdata/projecteuler/Problem_008"), "UTF-8");
        return String.join("", L);
    }
}
