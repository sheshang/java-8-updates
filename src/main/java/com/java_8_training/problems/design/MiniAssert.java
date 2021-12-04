package com.java_8_training.problems.design;

import java.util.function.Supplier;

// TODO: refactor to use deferred execution pattern
public class MiniAssert {

    public static void assertFalse(boolean condition, String message) {
        if (condition) {
            fail(message);
        }
    }

    public static void assertFalse(boolean condition, Supplier<String> msgSupplier) {
        if(condition) {
            fail(msgSupplier.get());
        }
    }

    public static void assertSame(Object expected, Object actual, String message) {
        if (expected != actual) {
            fail(message);
        }
    }

    public static void assertSame(Object expected, Object actual, Supplier<String> msgSupplier) {
        if (expected != actual) {
            fail(msgSupplier.get());
        }
    }

    public static void fail(String message) {
        if (message == null) {
            throw new AssertionError();
        }
        throw new AssertionError(message);
    }
}
