package com.blockchain;

import com.google.common.collect.ImmutableSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordSearchTest {
    private WordSearch search;

    @BeforeEach
    void beforeEach() {
        search = new WordSearch();
    }

    @Nested
    class WhenItSearchesSentencesWithOnePossibleReconstruction {
        private Set<String> dict;

        @BeforeEach
        void beforeEach() {
            dict = ImmutableSet.of("the", "quick", "brown", "fox");
        }

        @Test
        void itSearchesNaively() {
            var expected = "the quick brown fox";
            var actual = search.new Naive().search("thequickbrownfox", dict);
            assertEquals(expected, actual);
        }

        @Test
        void itSearchesRecursively() {
            var expected = "the quick brown fox";
            var actual = search.new Rec().search("thequickbrownfox", dict);
            assertEquals(expected, actual);
        }

        @Test
        void itUsesTabulation() {
            var expected = "the quick brown fox";
            var actual = search.new Tab().search("thequickbrownfox", dict);
            assertEquals(expected, actual);
        }
    }

    @Nested
    class WhenItSearchesSentencesWithManyPossibleReconstructions {
        private Set<String> dict;

        @BeforeEach
        void beforeEach() {
            dict = ImmutableSet.of("bed", "bath", "bedbath", "and", "beyond");
        }

        @Test
        void itSearchesNaively() {
            var expected = "bed bath and beyond";
            var actual = search.new Naive().search("bedbathandbeyond", dict);
            assertEquals(expected, actual);
        }

        @Test
        void itUsesTabulation() {
            var expected = "bed bath and beyond";
            var actual = search.new Tab().search("bedbathandbeyond", dict);
            assertEquals(expected, actual);
        }
    }
}
