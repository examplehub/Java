package com.examplehub.basics.function;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModifyFunctionArgsTest {
  @Test
  void test() {
    int num = 1;
    String str = "java";
    Integer integer = 55;
    int[] array = {1, 2, 3, 4, 5};
    ModifyFunctionArgs.MyObj obj = new ModifyFunctionArgs.MyObj();
    ModifyFunctionArgs.modify(num, str, integer, array, obj);
    assertEquals(1, num);
    assertEquals("java", str);
    assertEquals(55, integer);
    assertEquals(-1, array[0]);
    assertEquals(1, obj.age);
  }
}
