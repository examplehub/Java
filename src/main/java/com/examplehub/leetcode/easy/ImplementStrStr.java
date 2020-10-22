package com.examplehub.leetcode.easy;

/**
 * https://leetcode.com/problems/implement-strstr/
 */
public class ImplementStrStr {
    public static int solution1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static int solution2(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }
        return haystack.isEmpty() && needle.isEmpty() ? 0 : -1;
    }
}
