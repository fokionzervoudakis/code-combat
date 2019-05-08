package dailycodingproblem.problems_011_020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_017 {
    private Problem_017 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_017();
    }

    @Test
    void itReturnsTheLengthOfTheLongestFilepath() {
        assertEquals(12, P.maxFilepath("dir\n\tfile.ext"));
        assertEquals(20, P.maxFilepath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
        assertEquals(32, P.maxFilepath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
    }

    @Test
    void itReturnsZeroWhenTheFileSystemDoesNotContainFiles() {
        assertEquals(0, P.maxFilepath("dir"));
        assertEquals(0, P.maxFilepath("dir\n\tsubdir1\n\tsubdir2"));
        assertEquals(0, P.maxFilepath("dir\n\tsubdir1\n\tsubsubdir1\n\tsubdir2\n\tsubsubdir2"));
    }
}
