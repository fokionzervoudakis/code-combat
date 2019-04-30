package projecteuler;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_013 {
    @Test
    void itReturnsTheFirstTenDigits() throws Exception {
        var P = new Problem_013();
        assertEquals("5537376230", P.firstTen(readLines()));
    }

    private List<String> readLines() throws Exception {
        return FileUtils.readLines(new File("testdata/projecteuler/Problem_013"), "UTF-8");
    }
}
