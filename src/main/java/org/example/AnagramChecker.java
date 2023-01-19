package org.example;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        Arrays.sort(s1Chars);
        Arrays.sort(s2Chars);
        return Arrays.equals(s1Chars, s2Chars);
    }
}

