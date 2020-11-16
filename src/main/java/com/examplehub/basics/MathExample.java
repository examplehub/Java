package com.examplehub.basics;

public class MathExample {
  public static void main(String[] args) {
    System.out.println(Math.max(3, 4)); /* 4 */
    System.out.println(Math.min(-3, -2)); /* -3 */
    System.out.println(Math.sqrt(81)); /* 9.0 */
    System.out.println(Math.sqrt(2)); /* 1.4142135623730951 */
    System.out.println(Math.abs(-3)); /* 3 */
    System.out.println(Math.random()); /* [0.0 - 1.0) */

    int randomNumber = (int)(Math.random() * 100) + 1;
    System.out.println(randomNumber); /* [1, 100] */
  }
}
