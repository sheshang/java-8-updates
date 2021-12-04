package com.java_8_training.problems.defaultmethods;

public interface SimpleNumberOp {

    int getValue();

    static int add(SimpleNumberOp a, SimpleNumberOp b) {
        return a.getValue() + b.getValue();
    }

    default double getValueAsDouble() {
        throw new UnsupportedOperationException();
    }
}
