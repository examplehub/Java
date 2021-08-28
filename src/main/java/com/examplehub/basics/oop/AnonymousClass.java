package com.examplehub.basics.oop;

public class AnonymousClass {
    private String name;
    private String hiMsg;
    public AnonymousClass(String name) {
        this.name = name;
    }

    public void asyncHi() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                hiMsg = "Hi, " + name;
            }
        }).start();
    }

    public String getHiMsg() {
        return hiMsg;
    }
}
