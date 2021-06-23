package io.github.rahulrajsonu.mastercodinginterview.coding.string;

import java.util.Stack;

/**
 * Given two strings S and T,
 * Return if they equal when both are typed out.
 * Any'#' that appears in the string counts as a backspace.
 * Given Input: S= ab#d, T= del##  => not equal
 * Given Input: S= ab#l, T= at#l  => equal
 */
public class BackspaceStringCompare {

    /**
     * Input: ab#c#de##
     */
    public static boolean check(String s, String t){
        String dS = decode(s);
        String dT = decode(t);
        return dS.equals(dT);
    }

    public static boolean checkUsingStack(String s, String t){
        String dS = decodeUsingStack(s);
        String dT = decodeUsingStack(t);
        return dS.equals(dT);
    }

    private static String decode(String s) {
        String collector = "";
        int next = 0;
        while (next < s.length()){
            if(s.charAt(next)=='#'){
                if(collector.length()>1) {
                    collector = collector.substring(0, collector.length() - 2);
                }
            } else {
                collector = collector.concat(String.valueOf(s.charAt(next)));
            }
            next++;
        }
        return collector;
    }

    private static String decodeUsingStack(String s){
        Stack<Character> stack = new Stack<>();
        int cursor = 0;
        while (cursor < s.length()){
            if(s.charAt(cursor)=='#'){
                if(!stack.isEmpty())stack.pop();
            }else {
                stack.push(s.charAt(cursor));
            }
            cursor++;
        }
        String result = "";
        while (!stack.isEmpty()){
            result = String.valueOf(stack.pop()).concat(result);
        }
        return result;
    }

    /**
     * Input: s= ab#c#de#   t= ab#f#k#d
     */
    public static boolean optimizedSolution(String s, String t){
        int sp = s.length()-1;
        int tp = t.length()-1;

        while (sp >= 0 || tp >= 0){
            if (s.charAt(sp) == '#' || t.charAt(tp) == '#'){
                sp = backspace(s, sp);
                tp = backspace(t, tp);
            } else {
                if(s.charAt(sp) != t.charAt(tp)){
                    return Boolean.FALSE;
                }else {
                    sp--;
                    tp--;
                }
            }
        }
        return Boolean.TRUE;
    }

    private static int backspace(String s, int sp) {
        if(s.charAt(sp) == '#'){
            int hC = 2;
            while (sp > 0 && hC > 0) {
                sp--;
                hC--;

                if(s.charAt(sp)=='#'){
                    hC = hC+2;
                }
            }
        }
        return sp;
    }

}
