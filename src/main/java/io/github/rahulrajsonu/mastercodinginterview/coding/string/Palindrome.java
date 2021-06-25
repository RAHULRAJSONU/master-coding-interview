package io.github.rahulrajsonu.mastercodinginterview.coding.string;

/**
 * Given a string, determine if it is a palindrome,
 * Considering only alphanumeric characters and ignoring case sensitivity.
 * eg; "abcba" => True | "abcda" => false | "a" => true | "" => true
 */
public class Palindrome {

    public static boolean traverseInwardCheck(String str) {
        str = trim(str);
        int left = 0;
        int right = str.length()-1;
        while (left <= right){
            if(str.charAt(left) != str.charAt(right))
                return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    private static String trim(String str) {
        str = str.toLowerCase();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') &&
                    (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') && str.charAt(i) <= 9){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
