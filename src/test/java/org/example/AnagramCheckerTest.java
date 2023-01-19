package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramCheckerTest {
    @Test
    public void testIsAnagram() {
        assertTrue(AnagramChecker.isAnagram("word", "drow"));
        assertTrue(AnagramChecker.isAnagram("word", "drow"));
        assertTrue(AnagramChecker.isAnagram("Word", "DROW"));
        assertFalse(AnagramChecker.isAnagram("word", "wordd"));
        assertFalse(AnagramChecker.isAnagram("word", "word "));
        assertFalse(AnagramChecker.isAnagram("word", "word1"));
    }
}