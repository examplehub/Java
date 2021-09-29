package com.examplehub.basics.conversion;

public class TypeCast {
  public static void main(String[] args) {

    int number = 'a';
    /*
     * 97
     */
    System.out.println(number);

    int digit = '8' - '0';
    /*
     * 8
     */
    System.out.println(digit);

    double price = 3;

    /*
     * 8
     */
    int sum = (int) (3.5 + 4.6);
    System.out.println(sum);

    char letter = 65;
    /*
     * A
     */
    System.out.println(letter);
  }
}
