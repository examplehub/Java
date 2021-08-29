package com.examplehub.basics.oop;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import org.junit.jupiter.api.Test;

class ReadJavaBeanPropertiesTest {
  @Test
  void test() throws IntrospectionException {
    BeanInfo beanInfo = Introspector.getBeanInfo(MyBean.class);
    PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
    assertEquals(3, propertyDescriptors.length);
    assertEquals("age", propertyDescriptors[0].getName());
    assertEquals("getAge", propertyDescriptors[0].getReadMethod().getName());
    assertEquals("setAge", propertyDescriptors[0].getWriteMethod().getName());

    assertEquals("name", propertyDescriptors[2].getName());
    assertEquals("getName", propertyDescriptors[2].getReadMethod().getName());
    assertEquals("setName", propertyDescriptors[2].getWriteMethod().getName());
  }
}
