package com.examplehub.leetcode.middle;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static int solution1(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (allUnique(s, i, j)) {
                    max = Math.max(max, j - i);
                }
            }
        }
        return max;
    }

    /**
     * Test if one string has duplicate characters in a range of this string.
     *
     * @param s     the string to be checked.
     * @param start begin index
     * @param end   end index(exclude)
     * @return {@code true} if no duplicate characters, otherwise {@code false}.
     */
    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; ++i) {
            if (set.contains(s.charAt(i))) {
                return false;
            }
            set.add(s.charAt(i));
        }
        return true;
    }
}
