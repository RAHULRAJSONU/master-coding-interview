package io.github.rahulrajsonu.mastercodinginterview.coding.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters
 * eg; input abccabb => abc, cab => length = 3
 */
public class LongestSubstring {

    public static int fineByBruteforce(String str){
        int maxLen = 0;
        String cache = "";
        int windowLen = 0;
        for (int p = 0; p < str.length()-1; p++) {
            for (int p1 = p+1; p1 < str.length(); p1++) {
                if(!cache.contains(String.valueOf(str.charAt(p1)))){
                    cache = cache.concat(String.valueOf(str.charAt(p1)));
                    windowLen++;
                } else {
                    if(windowLen > maxLen){
                        maxLen = windowLen;
                    }else {
                        windowLen = 0;
                    }
                }
            }
        }
        if(windowLen > maxLen){
            maxLen = windowLen;
        }
        return maxLen;
    }

    /**
     *
     * input => abccabb
     * input => cccccc
     */
    public static int findOptimized(String str) {
        int maxLen = 0;
        int left = 0, right = 0;
        Map<Character, Integer> cache = new HashMap<>();
        while (right < str.length()){
            Character currentChar = str.charAt(right);
            int prevSeen = cache.getOrDefault(currentChar, Integer.MIN_VALUE);
            if (prevSeen >= left) {
                left = prevSeen+1;
            }
            cache.put(currentChar, right);
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }

}
