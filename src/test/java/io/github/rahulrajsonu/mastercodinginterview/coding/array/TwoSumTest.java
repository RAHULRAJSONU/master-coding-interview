package io.github.rahulrajsonu.mastercodinginterview.coding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void selfApproach() {
        int[] input = new int[]{1,3,7,9,2};
        assertArrayEquals(new int[]{3,4},TwoSum.selfApproach(input,11));
        assertArrayEquals(new int[]{0,4},TwoSum.selfApproach(input,3));
        assertArrayEquals(new int[]{0,1},TwoSum.selfApproach(input,4));
        Exception exception = assertThrows(RuntimeException.class, ()-> {
           TwoSum.selfApproach(input,15);
        });
        assertEquals("Could not found the numbers",exception.getMessage());
        Exception exception2 = assertThrows(RuntimeException.class, ()-> {
           TwoSum.selfApproach(new int[0],15);
        });
        assertEquals("Could not found the numbers",exception2.getMessage());
    }
}