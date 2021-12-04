package com.java_8_training.problems.defaultmethods;

public class ABBA implements A, B {
    @Override
    public String printHello() {
        return A.super.printHello();
    }
}
