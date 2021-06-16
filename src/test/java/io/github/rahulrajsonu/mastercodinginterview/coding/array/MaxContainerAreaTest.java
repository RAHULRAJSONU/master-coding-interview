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
        int[] input4 = new int[]{7,12,2,3,9};
        assertEquals(MaxContainerArea.bruteForceSolution(input),12);
        assertEquals(MaxContainerArea.bruteForceSolution(input1),28);
        assertEquals(MaxContainerArea.bruteForceSolution(input2),0);
        assertEquals(MaxContainerArea.bruteForceSolution(input3),0);
        assertEquals(MaxContainerArea.bruteForceSolution(input4),28);
    }

    @Test
    void optimizedSolution() {
        int[] input = new int[]{1,3,4,5,4,3};
        int[] input1 = new int[]{7,1,2,3,9};
        int[] input2 = new int[]{1};
        int[] input3 = new int[0];
        int[] input4 = new int[]{7,12,2,3,9};
        assertEquals(MaxContainerArea.optimizedSolution(input),12);
        assertEquals(MaxContainerArea.optimizedSolution(input1),28);
        assertEquals(MaxContainerArea.optimizedSolution(input2),0);
        assertEquals(MaxContainerArea.optimizedSolution(input3),0);
        assertEquals(MaxContainerArea.optimizedSolution(input4),28);
    }
}