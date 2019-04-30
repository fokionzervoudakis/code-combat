package csdojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LccTest {
    private Lcc lcc;

    @BeforeEach
    void beforeEach() {
        lcc = new Lcc();
    }

    @Test
    void itReturnsTheLongestConsecutiveCharacter() {
        assertEquals('B', lcc.getChar("AABCDDBBBEA".toCharArray()));
        assertEquals('B', lcc.getChar("AABCDDEABBB".toCharArray()));
    }

    @Test
    void itReturnsTheNullCharacterWhenTheArrayIsEmpty() {
        assertEquals('\0', lcc.getChar(new char[0]));
    }
}
