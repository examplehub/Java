package com.examplehub.basics;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Java", "Easy");
        hashMap.put("Python", "So easy");
        hashMap.put("C", "normal");

        /*
         * {Java=Easy, C=normal, Python=So easy}
         */
        System.out.println(hashMap);

        /*
         * So easy
         */
        System.out.println(hashMap.get("Python"));

        /*
         * Easy
         */
        System.out.println(hashMap.remove("Java"));

        /*
         * false
         */
        System.out.println(hashMap.remove("Python", "so easy"));

        /*
         * {C=normal, Python=So easy}
         */
        System.out.println(hashMap);

        /*
         * 2
         */
        System.out.println(hashMap.size());

        /*
         * C
         * Python
         */
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }

        /*
         * normal
         * So easy
         */
        for (String value : hashMap.values()) {
            System.out.println(value);
        }

        /*
         * C : normal
         * Python : So easy
         */
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
