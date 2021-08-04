package com.examplehub.leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {
    public static boolean solution1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] firstChars = s.toCharArray();
        char[] secondChars = t.toCharArray();
        Arrays.sort(firstChars);
        Arrays.sort(secondChars);
        return Arrays.equals(firstChars, secondChars);
    }

    public static boolean solution2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        StringBuilder builder = new StringBuilder(s);
        for (char ch : t.toCharArray()) {
            int index = builder.indexOf(ch + "");
            if (index != -1) {
                builder.deleteCharAt(index);
            }
        }
        return builder.length() == 0;
    }

    public static boolean solution3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] hashTable = new int[26];
        for (char ch : s.toCharArray()) {
            hashTable[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            int index = ch - 'a';
            hashTable[index]--;
            if (hashTable[index] < 0) {
                return false;
            }
        }
        return true;
    }
}
