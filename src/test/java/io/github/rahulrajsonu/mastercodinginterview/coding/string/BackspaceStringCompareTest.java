package io.github.rahulrajsonu.mastercodinginterview.coding.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStringCompareTest {

    @Test
    void checkTest() {
        assertFalse(BackspaceStringCompare.check("AB#C#D","B#C#DA"));
        assertFalse(BackspaceStringCompare.check("AB#C####D","B#C#DA"));
        assertFalse(BackspaceStringCompare.check("##AB#C#D","B#C#DA###"));
        assertTrue(BackspaceStringCompare.check("AB#C#D","AD#C#D"));
        assertTrue(BackspaceStringCompare.check("AB#C#D##","AD#C#D##"));
        assertTrue(BackspaceStringCompare.check("AB","AB"));
        assertTrue(BackspaceStringCompare.check("",""));
    }

    @Test
    void checkUsingStackTest() {
        assertFalse(BackspaceStringCompare.checkUsingStack("AB#C#D","B#C#DA"));
        assertFalse(BackspaceStringCompare.checkUsingStack("AB#C####D","B#C#DA"));
        assertFalse(BackspaceStringCompare.checkUsingStack("##AB#C#D","B#C#DA###"));
        assertTrue(BackspaceStringCompare.checkUsingStack("AB#C#D","AD#C#D"));
        assertTrue(BackspaceStringCompare.checkUsingStack("AB#C#D##","AD#C#D##"));
        assertTrue(BackspaceStringCompare.checkUsingStack("AB","AB"));
        assertTrue(BackspaceStringCompare.checkUsingStack("",""));
    }

    @Test
    void optimizedSolutionTest(){
        assertFalse(BackspaceStringCompare.optimizedSolution("AB#C#D","B#C#DA"));
        assertFalse(BackspaceStringCompare.optimizedSolution("AB#C####D","B#C#DA"));
        assertFalse(BackspaceStringCompare.optimizedSolution("##AB#C#D","B#C#DA###"));
        assertTrue(BackspaceStringCompare.optimizedSolution("AB#C#D","AD#C#D"));
        assertTrue(BackspaceStringCompare.optimizedSolution("AB#C#D##","AD#C#D##"));
        assertTrue(BackspaceStringCompare.optimizedSolution("AB","AB"));
        assertTrue(BackspaceStringCompare.optimizedSolution("",""));
    }
}