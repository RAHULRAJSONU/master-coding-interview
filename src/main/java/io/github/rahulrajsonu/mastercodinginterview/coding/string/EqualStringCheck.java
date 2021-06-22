package io.github.rahulrajsonu.mastercodinginterview.coding.string;

/**
 * Given two strings S and T,
 * Return if they equal when both are typed out.
 * Any'#' that appears in the string counts as a backspace.
 * Given Input: S= ab#d, T= del##  => not equal
 * Given Input: S= ab#l, T= at#l  => equal
 */
public class EqualStringCheck {

    /**
     * Input: ab#c#de##
     */
    public static boolean check(String s, String t){
        String dS = decode(s);
        String dT = decode(t);
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

}
