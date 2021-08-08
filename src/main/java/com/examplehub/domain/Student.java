package com.examplehub.domain;

public class Student implements Comparable<Student> {
  private int id;
  private int Chinese;
  private int math;
  int english;

  public Student() {}

  public Student(int id, int chinese, int math, int english) {
    this.id = id;
    Chinese = chinese;
    this.math = math;
    this.english = english;
  }

  public int getTotal() {
    return this.getChinese() + this.getMath() + this.getEnglish();
  }
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getChinese() {
    return Chinese;
  }

  public void setChinese(int chinese) {
    Chinese = chinese;
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    this.math = math;
  }

  public int getEnglish() {
    return english;
  }

  public void setEnglish(int english) {
    this.english = english;
  }

  @Override
  public int compareTo(Student o) {
    if (this.getTotal() != o.getTotal()) {
      return this.getTotal() - o.getTotal();
    } else if (this.getChinese() != o.getChinese()) {
      return this.getChinese() - o.getChinese();
    } else if (this.getMath() != o.getMath()) {
      return this.getMath() - o.getMath();
    } else {
      return this.getMath() - o.getMath();
    }
  }

  @Override
  public String toString() {
    return "Student{"
        + "id="
        + id
        + ", Chinese="
        + Chinese
        + ", math="
        + math
        + ", english="
        + english
        + '}';
  }
}
