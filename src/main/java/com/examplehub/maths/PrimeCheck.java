package com.examplehub.maths;

public class PrimeCheck {

  /**
   * Check if a number is prime number or not.
   *
   * @param number the number to be checked.
   * @return {@code true} if the given {@code number} is prime, otherwise {@code false}.
   */
  public static boolean isPrime(long number) {
    /* negative numbers and 0, 1 are not primes */
    if (number < 2) {
      return false;
    }

    /* both of 2 and 3 is primes */
    if (number == 2 || number == 3) {
      return true;
    }

    /* all even numbers which is larger than 2 are not primers */
    if (number % 2 == 0) {
      return false;
    }

    for (int i = 3, limit = (int) (Math.sqrt(number)); i <= limit; i += 2) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
