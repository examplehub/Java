package com.examplehub.maths;

public class GeometricProgression {

  /**
   * Get nth item of geometric progression.
   *
   * @param firstItem the first item of geometric progression.
   * @param commonRatio the common ratio of geometric progression.
   * @param nth the nth.
   * @return the nth item of geometric progression.
   */
  public static double getNth(double firstItem, double commonRatio, int nth) {
    return firstItem * Math.pow(commonRatio, nth - 1);
  }

  /**
   * Sum of geometric progression.
   *
   * @param firstItem the first item of geometric progression.
   * @param commonRatio the common ratio of geometric progression.
   * @param nth the nth.
   * @return the sum of geometric progression.
   */
  public static double sum(double firstItem, double commonRatio, int nth) {
    return commonRatio == 1
        ? firstItem * nth
        : firstItem * (1 - Math.pow(commonRatio, nth)) / (1 - commonRatio);
  }
}
