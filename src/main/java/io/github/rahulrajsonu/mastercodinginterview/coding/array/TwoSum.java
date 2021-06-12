package io.github.rahulrajsonu.mastercodinginterview.coding.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement: Given an array of unique and positive integers,
 * return the indices of two number that add up to a given target.
 * Given Input: [1,3,7,9,2]
 * Expected return: [3,4]
 */
public class TwoSum {

    public static int[] selfApproach(int[] arr, int sum){
        int[] indices = new int[2];
        Map<Integer, Integer> valueIdxMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            valueIdxMap.put(arr[i],i);
            if (valueIdxMap.containsKey(sum-arr[i])){
                indices[0] = valueIdxMap.get(sum-arr[i]);
                indices[1] = i;
                return indices;
            }
        }
        throw new RuntimeException("Could not found the numbers");
    }
}
