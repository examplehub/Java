package com.examplehub.basics.oop;

public class VarargsExample {
  private String[] languages;

  public void setLanguage(String... languages) {
    this.languages = languages;
  }

  public String[] getLanguages() {
    return languages;
  }

  public int sum(int... nums) {
    int sum = 0;
    for (int num : nums) {
      sum = sum + num;
    }
    return sum;
  }
}
