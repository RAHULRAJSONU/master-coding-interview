package io.github.rahulrajsonu.mastercodinginterview.coding.array;

/**
 * Problem Statement: Given an array of integer representing an elevation map where the width of each bar is 1.
 * Return how much rainwater can be trapped.
 * Given: [0,1,0,2,1,0,3,1,0,1,2]
 * returns 8
 */
public class RainwaterTrapping {

    public static int bruteforceSolution(int[] arr){
        int totalWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int leftMax = arr[i];
            int rightMax = arr[i];
            // find the left max
            for (int j = i; j >= 0; j--){
                if(arr[j] >= leftMax){
                    leftMax = arr[j];
                }
            }
            // find the right max
            for(int k = i; k < arr.length; k++){
                if(arr[k] >= rightMax){
                    rightMax = arr[k];
                }
            }
//            System.out.println(String.format("current: %d | leftMax: %d | rightMax: %d | waterAbove: %d",arr[i],leftMax,rightMax,Integer.min(leftMax,rightMax)-arr[i]));
            totalWater += Integer.min(leftMax,rightMax)-arr[i];
        }
        return totalWater;
    }

}
