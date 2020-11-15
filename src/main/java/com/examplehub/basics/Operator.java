package com.examplehub.basics;

public class Operator {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("a + b = " + (a + b)); /* a + b = 7 */
        System.out.println("a - b = " + (a - b)); /* a - b = -1 */
        System.out.println("a * b = " + (a * b)); /* a * b = 12 */
        System.out.println("a / b = " + (a / b)); /* a / b = 0 */
        System.out.println("3 / 4.0 = " + 3 / 4.0); /* 3 / 4.0 = 0.75 */
        System.out.println("a % b = " + (a % b)); /* a % b = 3 */

        int i = 1;
        i++;
        System.out.println("i = " + i); /* i = 2 */

        i--;
        System.out.println("i = " + i); /* i = 1 */

        int j = 5;
        System.out.println("j++ = " + j++); /* j++ = 5 */
        System.out.println("j = " + j); /* j = 6 */

        int k = 10;
        System.out.println("++k = " + ++k); /* ++k = 11 */
        System.out.println("k = " + k); /* k = 11 */

        System.out.println("3&4 = " + (3 & 4));
        System.out.println("3|4 = " + (3 | 4));
        System.out.println("~4 = " + ~4);
        System.out.println("3^4 = " + (3 ^ 4));
        System.out.println("4<<1 = " + (4 << 1));
        System.out.println("4>>1=" + (4 >> 1));
        System.out.println("4>>>1=" + (4 >>> 1));

    }
}
