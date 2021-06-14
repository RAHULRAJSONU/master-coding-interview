package io.github.rahulrajsonu.mastercodinginterview.coding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxContainerAreaTest {

    @Test
    void bruitForceSolution() {
        int[] input = new int[]{1,3,4,5,4,3};
        int[] input1 = new int[]{7,1,2,3,9};
        int[] input2 = new int[]{1};
        int[] input3 = new int[0];
        assertEquals(MaxContainerArea.bruitForceSolution(input),12);
        assertEquals(MaxContainerArea.optimizedSolution(input),12);
        assertEquals(MaxContainerArea.bruitForceSolution(input1),28);
        assertEquals(MaxContainerArea.optimizedSolution(input1),28);
        assertEquals(MaxContainerArea.bruitForceSolution(input2),0);
        assertEquals(MaxContainerArea.optimizedSolution(input2),0);
        assertEquals(MaxContainerArea.bruitForceSolution(input3),0);
        assertEquals(MaxContainerArea.optimizedSolution(input3),0);
    }
}