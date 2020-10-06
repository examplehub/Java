package com.examplehub.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {

        /*
         * Searched
         */
        Pattern pattern = Pattern.compile("hub", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("ExampleHub");
        if (matcher.find()) {
            System.out.println("Searched");
        } else {
            System.out.println("Not searched");
        }
    }
}
