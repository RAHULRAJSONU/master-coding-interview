package io.github.rahulrajsonu.mastercodinginterview.coding.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    @Test
    void find() {
        assertEquals(3, LongestSubstring.find("abccabb"));
        assertEquals(1, LongestSubstring.find("cccccc"));
        assertEquals(0, LongestSubstring.find(""));
        assertEquals(4, LongestSubstring.find("abcbda"));
    }

    @Test
    void fineByBruteforce() {
        assertEquals(3, LongestSubstring.fineByBruteforce("abccabb"));
        assertEquals(1, LongestSubstring.fineByBruteforce("cccccc"));
        assertEquals(0, LongestSubstring.fineByBruteforce(""));
        assertEquals(4, LongestSubstring.fineByBruteforce("abcbda"));
    }
}