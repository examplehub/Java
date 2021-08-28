package com.examplehub.basics.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterfaceExampleTest {
    @Test
    void test() {
        USB usb = new Phone();
        assertEquals("phone's usb", usb.charge());
        usb = new Computer();
        assertEquals("computer's usb", usb.charge());
        assertEquals("hello world", usb.defaultFunction());
    }
}