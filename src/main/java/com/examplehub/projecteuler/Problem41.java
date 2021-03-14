package com.examplehub.projecteuler;

import com.examplehub.maths.CharToInt;
import java.util.Arrays;

/** https://projecteuler.net/problem=41 */
public class Problem41 {
  public static long solution1() {
    for (int i = 999999999; i >= 1; --i) {
      char[] chars = (i + "").toCharArray();
      Arrays.sort(chars);
      if (chars[0] == '0') {
        continue;
      }
      for (int j = 0; j < chars.length - 1; j++) {
        if (CharToInt.toInt(chars[j + 1]) - CharToInt.toInt(chars[j]) != 1) {
          break;
        }
      }
    }
    return 0;
  }
}
