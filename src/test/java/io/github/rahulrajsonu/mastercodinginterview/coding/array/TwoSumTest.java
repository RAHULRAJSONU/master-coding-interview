package io.github.rahulrajsonu.mastercodinginterview.coding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void selfApproach() {
        int[] input = new int[]{1,3,7,9,2};
        assertArrayEquals(new int[]{3,4},TwoSum.selfApproach(input,11));
        assertArrayEquals(new int[]{0,4},TwoSum.selfApproach(input,3));
        Exception exception = assertThrows(RuntimeException.class, ()-> {
           TwoSum.selfApproach(input,15);
        });
        assertEquals("Could not found the numbers",exception.getMessage());
    }
}