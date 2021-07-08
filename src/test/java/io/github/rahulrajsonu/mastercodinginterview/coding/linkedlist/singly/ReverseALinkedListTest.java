package io.github.rahulrajsonu.mastercodinginterview.coding.linkedlist.singly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseALinkedListTest {

    @Test
    void reverse() {
        int[] vals = new int[]{1,2,3,4,5,6};
        int[] rev = new int[]{6,5,4,3,2,1};
        assertTrue(Utils.match(Utils.construct(rev), ReverseALinkedList.reverse(Utils.construct(vals))));
    }
}