package com.examplehub.basics;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        Test test = new Test();
        test = null;
        System.gc(); /* garbage collector is called. */

        test = new Test();
        test = null;
        Runtime.getRuntime().gc(); /* garbage collector is called. */
    }
}

class Test {
    public Test() {

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("garbage collector is called.");
    }
}
