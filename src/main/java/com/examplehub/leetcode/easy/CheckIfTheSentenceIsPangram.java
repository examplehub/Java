package com.examplehub.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;

public class CheckIfTheSentenceIsPangram {
    public static boolean solution1(String sentence) {
        boolean[] table = new boolean[26];
        for (char ch : sentence.toCharArray()) {
            table[ch - 'a'] = true;
        }
        for (boolean b : table) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static boolean solution2(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : sentence.toCharArray()) {
            set.add(ch);
        }
        char[] chars = new char[set.size()];
        int index = 0;
        for (char ch : set) {
            chars[index++] = ch;
        }
        Arrays.sort(chars);
        for (int ch = 'a', i = 0; ch <= 'z'; ++ch, ++i) {
            if (ch != chars[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean solution3(String sentence) {
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            if (!sentence.contains(ch + "")) {
                return false;
            }
        }
        return true;
    }
}
