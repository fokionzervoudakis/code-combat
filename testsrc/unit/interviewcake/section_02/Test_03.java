package interviewcake.section_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test_03 {
    private Problem_03 P;

    @BeforeEach
    void beforeEach() {
        P = new Problem_03();
    }

    @Test
    void itCountsWordsInASmallSentence() {
        var expected = "{I=1, like=1, cake=1}";
        var actual = P.countWords("I like cake").toString();
        assertEquals(expected, actual);
    }

    @Test
    void itCountsWordsInALargeSentence() {
        var expected = "{Chocolate=1, cake=2, for=2, dinner=1, and=1, pound=1, dessert=1}";
        var actual = P.countWords("Chocolate cake for dinner and pound cake for dessert").toString();
        assertEquals(expected, actual);
    }

    @Test
    void itIgnoresPunctuation() {
        var expected = "{Strawberry=1, short=1, cake=1, Yum=1}";
        var actual = P.countWords("Strawberry short cake? Yum!").toString();
        assertEquals(expected, actual);
    }

    @Test
    void itIncludesHyphenatedWords() {
        var expected = "{Dessert=1, mille-feuille=1, cake=1}";
        var actual = P.countWords("Dessert - mille-feuille cake").toString();
        assertEquals(expected, actual);
    }

    @Test
    void itIgnoresEllipses() {
        var expected = "{mmm=2, decisions=2}";
        var actual = P.countWords("Mmm...mmm...decisions...decisions").toString();
        assertEquals(expected, actual);
    }

    @Test
    void itIncludesApostrophes() {
        var expected = "{Allie's=1, Bakery=1, Sasha's=1, Cakes=1}";
        var actual = P.countWords("Allie's Bakery: Sasha's Cakes").toString();
        assertEquals(expected, actual);
    }
}
