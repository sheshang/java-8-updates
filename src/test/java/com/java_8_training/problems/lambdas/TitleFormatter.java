package com.java_8_training.problems.lambdas;

import java.util.Arrays;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.joining;

public class TitleFormatter implements TextFormatter {

    public static final Pattern spaces = Pattern.compile("\\s+");

    public String format(String title) {

        return spaces.splitAsStream(title)
                     .map(String::toLowerCase)
                     .map(this::firstToUppercase)
                     .collect(joining(" "));
    }

    private String firstToUppercase(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

}
