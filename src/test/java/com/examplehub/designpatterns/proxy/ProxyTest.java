package com.examplehub.designpatterns.proxy;

import com.examplehub.designpatterns.decorator.Readable;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class ProxyTest {
  @Test
  @Disabled
  void test() {
    Readable readable = new Proxy();
    readable.read();
  }
}