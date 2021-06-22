package io.github.rahulrajsonu.mastercodinginterview.coding.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualStringCheckTest {

    @Test
    void check() {
        assertFalse(EqualStringCheck.check("AB#C#D","B#C#DA"));
        assertFalse(EqualStringCheck.check("AB#C####D","B#C#DA"));
        assertFalse(EqualStringCheck.check("##AB#C#D","B#C#DA###"));
        assertTrue(EqualStringCheck.check("AB#C#D","AD#C#D"));
        assertTrue(EqualStringCheck.check("AB#C#D##","AD#C#D##"));
        assertTrue(EqualStringCheck.check("AB","AB"));
        assertTrue(EqualStringCheck.check("",""));
    }

    @Test
    void checkUsingStack() {
        assertFalse(EqualStringCheck.checkUsingStack("AB#C#D","B#C#DA"));
        assertFalse(EqualStringCheck.checkUsingStack("AB#C####D","B#C#DA"));
        assertFalse(EqualStringCheck.checkUsingStack("##AB#C#D","B#C#DA###"));
        assertTrue(EqualStringCheck.checkUsingStack("AB#C#D","AD#C#D"));
        assertTrue(EqualStringCheck.checkUsingStack("AB#C#D##","AD#C#D##"));
        assertTrue(EqualStringCheck.checkUsingStack("AB","AB"));
        assertTrue(EqualStringCheck.checkUsingStack("",""));
    }
}