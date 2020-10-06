package com.examplehub.leetcode.easy;

/**
 * https://leetcode.com/problems/longest-common-prefix/solution/
 */
public class LongestCommonPrefix {
    public static String solution1(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        if (strings.length == 1) {
            return strings[0];
        }
        String longestCommonPrefix = "";
        for (int i = 1; i <= strings[0].length(); i++) {
            String prefix = strings[0].substring(0, i);
            for (int j = 1; j < strings.length; j++) {
                if (strings[j].indexOf(prefix) != 0) {
                    return longestCommonPrefix;
                }
                if (j == strings.length - 1) {
                    longestCommonPrefix = prefix;
                }
            }
        }
        return longestCommonPrefix;
    }

    public static String solution2(String[] strings) {
        if (strings.length == 0) {
            return "";
        }
        String longestCommonPrefix = strings[0];
        for (int i = 1; i < strings.length; i++) {
            while (strings[i].indexOf(longestCommonPrefix) != 0) {
                longestCommonPrefix = longestCommonPrefix.substring(0, longestCommonPrefix.length() - 1);
                if (longestCommonPrefix.equals("")) {
                    return "";
                }
            }
        }
        return longestCommonPrefix;
    }
}
