package io.github.rahulrajsonu.mastercodinginterview.coding.array;

/**
 * Problem Statement: You are given an array of positive integers where each integers represents the height of a vertical line on a chart.
 * Find two lines which together with the X-axis forms a container that would hold the greatest amount of water.
 * Return the area of water, it would hold.
 * Given array [1,3,4,5,4,3]
 * max area = 16
 */
public class MaxContainerArea {

    public static int bruteForceSolution(int[] arr){
        if (arr.length<=1) return 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int area = (Integer.min(arr[i],arr[j])*(j-i));
                if(area > max) max = area;
            }
        }
        return max;
    }

    public static int optimizedSolution(int[] arr){
        if (arr.length<=1) return 0;
        int minC = 0;
        int maxC = arr.length-1;
        int maxArea = Integer.MIN_VALUE;
        while (minC < maxC) {
            int area = (Integer.min(arr[minC], arr[maxC])*(maxC-minC));
            if (area > maxArea){
                maxArea = area;
            }
            if(arr[minC] <= arr[maxC]){
                minC++;
            }else {
                maxC--;
            }
        }
        return maxArea;
    }
}
