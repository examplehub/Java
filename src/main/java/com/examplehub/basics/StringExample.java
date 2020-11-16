package com.examplehub.basics;

public class StringExample {
  public static void main(String[] args) {

    String str = new String("abc");
    System.out.println(str); /* abc */

    String name = "Github";
    System.out.println(name);

    String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println(letters.length()); /* 26 */

    System.out.println(letters.toLowerCase()); /* abcdefghijklmnopqrstuvwxyz */

    String filename = "abc.txt";
    System.out.println(filename.indexOf(".txt")); /* 3 */
    System.out.println(filename.indexOf(".")); /* 3 */
    System.out.println(filename.substring(0, filename.indexOf("."))); /* abc */

    String host = "github.com";
    String firstname = "shell";
    String lastname = "hub";
    System.out.println(host + "/" + firstname + lastname); /* github.com/shellhub */
    System.out.println(host.concat("/").concat(firstname).concat(lastname));

    // escape characters
    System.out.println("\'"); /* ' */
    System.out.println("'"); /* ' */
    System.out.println("I'm good at Java"); /* I'm good at Java */
    System.out.println("\"HelloWorld\""); /* "HelloWorld" */
    System.out.println("\\n"); /* \n */
    System.out.println("\\\\"); /* \\ */

    int year = 1997;
    System.out.println("Google is created at " + year); /* Google is created at 1997 */
  }
}
