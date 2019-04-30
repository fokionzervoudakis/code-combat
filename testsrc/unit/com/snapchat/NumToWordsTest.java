package com.snapchat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumToWordsTest {
    private NumToWords words;

    @BeforeEach
    void beforeEach() {
        words = new NumToWords();
    }

    @Test
    void itConvertsZero() {
        assertEquals("Zero", words.getWords(0));
    }

    @Test
    void itConvertsSingles() {
        assertEquals("One", words.getWords(1));
        assertEquals("Nine", words.getWords(9));
    }

    @Test
    void itConvertsTeens() {
        assertEquals("Eleven", words.getWords(11));
        assertEquals("Nineteen", words.getWords(19));
    }

    @Test
    void itConvertsTens() {
        assertEquals("Ten", words.getWords(10));
        assertEquals("Twenty", words.getWords(20));
        assertEquals("Ninety", words.getWords(90));
    }

    @Test
    void itConvertsHundreds() {
        assertEquals("One Hundred", words.getWords(100));
        assertEquals("Two Hundred", words.getWords(200));
        assertEquals("Nine Hundred", words.getWords(900));
    }

    @Test
    void itConvertsNumbersToWords() {
        assertEquals("One Hundred Twenty Three", words.getWords(123));
        assertEquals("Twelve Thousand Three Hundred Forty Five", words.getWords(12345));
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", words.getWords(1234567));
        assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One", words.getWords(1234567891));
    }
}
