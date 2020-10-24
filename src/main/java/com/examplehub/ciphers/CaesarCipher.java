package com.examplehub.ciphers;

/** https://en.wikipedia.org/wiki/Caesar_cipher */
public class CaesarCipher {

  /**
   * Encrypt a string by caesar cipher algorithm.
   *
   * @param origin the origin text.
   * @param steps the steps to be moved.
   * @return the string encrypted.
   */
  public static String encrypt(String origin, int steps) {
    char[] password = origin.toCharArray();
    for (int i = 0; i < password.length; ++i) {
      if (Character.isUpperCase(password[i])) {
        password[i] = (char) ('A' + (password[i] - 'A' + steps) % 26);
      } else if (Character.isLowerCase(password[i])) {
        password[i] = (char) ('a' + (password[i] - 'a' + steps) % 26);
      }
    }
    return String.valueOf(password);
  }

  /**
   * Decrypt a string.
   *
   * @param password the password to be decrypted.
   * @param steps the steps to be moved.
   * @return the string decrypted.
   */
  public static String decrypt(String password, int steps) {
    char[] origin = password.toCharArray();
    for (int i = 0; i < password.length(); ++i) {
      if (Character.isUpperCase(origin[i])) {
        origin[i] = (char) ('A' + (origin[i] - 'A' - steps + 26) % 26);
      } else if (Character.isLowerCase(origin[i])) {
        origin[i] = (char) ('a' + (origin[i] - 'a' - steps + 26) % 26);
      }
    }
    return String.valueOf(origin);
  }
}
