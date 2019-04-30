package projecteuler;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_022 {
    @Test
    void itCalculatesTheSumOfEvenFibonacciNumbers() throws Exception {
        var P = new Problem_022();
        assertEquals(871198282, P.nameScoreTotal(readFile()));
    }

    private List<String> readFile() throws Exception {
        var S = FileUtils.readFileToString(new File("testdata/projecteuler/Problem_022"), "UTF-8");
        return Stream.of(S.replaceAll("\"", "").split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }
}
