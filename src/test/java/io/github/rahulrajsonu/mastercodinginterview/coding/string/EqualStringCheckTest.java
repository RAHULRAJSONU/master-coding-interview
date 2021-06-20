package io.github.rahulrajsonu.mastercodinginterview.coding.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualStringCheckTest {

    @Test
    void check() {
        String s1 = "AB#C#D";
        String t1 = "B#C#DA";
        assertFalse(EqualStringCheck.check(s1,t1));
        String s2 = "AB#C#D";
        String t2 = "AD#C#D";
        assertTrue(EqualStringCheck.check(s2,t2));
    }
}