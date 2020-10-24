package com.examplehub.strings;

import java.util.ArrayList;
import java.util.List;

public class NativePatternSearching {
  public static int[] search(String mainString, String pattern) {
    List<Integer> position = new ArrayList<>();
    for (int i = 0; i < mainString.length() - pattern.length() + 1; i++) {
      for (int j = 0; j < pattern.length(); j++) {
        if (mainString.charAt(i + j) != pattern.charAt(j)) {
          break;
        }
        if (j == pattern.length() - 1) {
          /* pattern matched */
          position.add(i);
        }
      }
    }
    return position.stream().mapToInt(i -> i).toArray();
  }
}
