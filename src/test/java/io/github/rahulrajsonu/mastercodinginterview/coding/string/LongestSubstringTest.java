package io.github.rahulrajsonu.mastercodinginterview.coding.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    @Test
    void findOptimized() {
        assertEquals(3, LongestSubstring.findOptimized("abccabb"));
        assertEquals(1, LongestSubstring.findOptimized("cccccc"));
        assertEquals(0, LongestSubstring.findOptimized(""));
        assertEquals(4, LongestSubstring.findOptimized("abcbda"));
    }

    @Test
    void fineByBruteforce() {
        assertEquals(3, LongestSubstring.fineByBruteforce("abccabb"));
        assertEquals(1, LongestSubstring.fineByBruteforce("cccccc"));
        assertEquals(0, LongestSubstring.fineByBruteforce(""));
        assertEquals(4, LongestSubstring.fineByBruteforce("abcbda"));
    }
}