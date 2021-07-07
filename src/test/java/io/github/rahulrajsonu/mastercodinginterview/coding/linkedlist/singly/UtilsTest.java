package io.github.rahulrajsonu.mastercodinginterview.coding.linkedlist.singly;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void construct() {
        int[] vals = new int[]{1,2,3,4,5,6};
        Node head = Utils.construct(vals);
        assertEquals(1, head.val);
        assertEquals(2, head.next.val);
        assertEquals(3, head.next.next.val);
        assertEquals(4, head.next.next.next.val);
        assertEquals(5, head.next.next.next.next.val);
        assertEquals(6, head.next.next.next.next.next.val);
    }

    @Test
    void print() {
        int[] vals = new int[]{1,2,3,4,5,6};
        Node head = Utils.construct(vals);
        Utils.print(head);
        assertEquals("1->2->3->4->5->6", outputStreamCaptor.toString()
                .trim());
    }

    @Test
    void match() {
        int[] vals = new int[]{1,2,3,4,5,6};
        int[] vals2 = new int[]{1,2,3,4,5};
        assertTrue(Utils.match(Utils.construct(vals),Utils.construct(vals)));
        assertFalse(Utils.match(Utils.construct(vals),Utils.construct(vals2)));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}