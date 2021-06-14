package io.github.rahulrajsonu.mastercodinginterview.coding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxContainerAreaTest {

    @Test
    void bruitForceSolution() {
        int[] input = new int[]{1,3,4,5,4,3};
        assertEquals(MaxContainerArea.bruitForceSolution(input),12);
    }
}