package com.examplehub.basics;

public class ConstructorExample {
    public static void main(String[] args) {
        ConstructorTest test = new ConstructorTest();
        System.out.println(test); /* ConstructorTest{username='admin', password='112233'} */

        test = new ConstructorTest("root", "root");
        System.out.println(test); /* ConstructorTest{username='root', password='root'} */
    }
}

class ConstructorTest {
    public String username;
    public String password;

    public ConstructorTest() {
        this("admin", "112233");
    }

    public ConstructorTest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "ConstructorTest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
