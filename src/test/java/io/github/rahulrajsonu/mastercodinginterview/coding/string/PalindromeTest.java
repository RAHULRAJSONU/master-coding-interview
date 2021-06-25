package io.github.rahulrajsonu.mastercodinginterview.coding.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void traverseInwardCheck() {
        assertTrue(Palindrome.traverseInwardCheck("abcba"));
        assertTrue(Palindrome.traverseInwardCheck("a;b-Cba"));
        assertTrue(Palindrome.traverseInwardCheck("a0;b-Cb0a"));
        assertTrue(Palindrome.traverseInwardCheck("aaa"));
        assertTrue(Palindrome.traverseInwardCheck("a"));
        assertTrue(Palindrome.traverseInwardCheck(""));
    }
}