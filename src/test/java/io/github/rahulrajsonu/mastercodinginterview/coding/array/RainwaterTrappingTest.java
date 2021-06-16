package io.github.rahulrajsonu.mastercodinginterview.coding.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RainwaterTrappingTest {

    @Test
    void bruteforceSolution() {
        int[] input = new int[]{0,1,0,2,1,0,3,1,0,1,2};
        int[] input1 = new int[0];
        int[] input2 = new int[]{3};
        int[] input3 = new int[]{3,4,3};
        assertEquals(8,RainwaterTrapping.bruteforceSolution(input));
        assertEquals(0,RainwaterTrapping.bruteforceSolution(input1));
        assertEquals(0,RainwaterTrapping.bruteforceSolution(input2));
        assertEquals(0,RainwaterTrapping.bruteforceSolution(input3));
    }

    @Test
    void optimizedSolution() {
        int[] input = new int[]{0,1,0,2,1,0,3,1,0,1,2};
        int[] input1 = new int[0];
        int[] input2 = new int[]{3};
        int[] input3 = new int[]{3,4,3};
        assertEquals(8,RainwaterTrapping.optimizedSolution(input));
        assertEquals(0,RainwaterTrapping.optimizedSolution(input1));
        assertEquals(0,RainwaterTrapping.optimizedSolution(input2));
        assertEquals(0,RainwaterTrapping.optimizedSolution(input3));
    }
}