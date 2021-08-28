package com.examplehub.basics.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnonymousClassTest {
    @Test
    void test() {
        AnonymousClass anonymousClass = new AnonymousClass("JACK");
        anonymousClass.asyncHi();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals("Hi, JACK", anonymousClass.getHiMsg());
    }
}