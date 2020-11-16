package com.examplehub.maths;

public class FrogJump {
  public static int canCross(int leaf, int stone) {
    return stone == 0 ? leaf + 1 : 2 * canCross(leaf, stone - 1);
  }
}
