package io.github.rahulrajsonu.mastercodinginterview.coding.linkedlist.singly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSpecificPositionInLinkedListTest {

    @Test
    void reverse() {
        int[] vals = new int[]{1,2,3,4,5,6};
        int[] rev = new int[]{4,3,2,1,5,6};
//        Utils.print(ReverseSpecificPositionInLinkedList.reverse(Utils.construct(vals),1,4));
        assertTrue(Utils.match(ReverseSpecificPositionInLinkedList.reverse(Utils.construct(vals),1,4),Utils.construct(rev)));
    }

    @Test
    void reverseSublist() {
        int[] vals = new int[]{1,2,3,4,5,6};
        int[] rev = new int[]{4,3,2,1,5,6};
//        Utils.print(ReverseSpecificPositionInLinkedList.reverseSublist(Utils.construct(vals),1,4));
        assertTrue(Utils.match(ReverseSpecificPositionInLinkedList.reverse(Utils.construct(vals),1,4),Utils.construct(rev)));
    }
}