package com.java_8_training.answers.design;

import java.util.function.Supplier;

public class MiniAssert {

    public static void assertFalse(boolean condition, String message) {
        assertFalse(condition, () -> message);
    }

    public static void assertFalse(boolean condition, Supplier<String> message) {
        if (condition) {
            fail(message.get());
        }
    }

    public static void assertSame(Object expected, Object actual, String message) {
        assertSame(expected, actual, () -> message);
    }

    public static void assertSame(Object expected, Object actual, Supplier<String> message) {
        if (expected != actual) {
            fail(message.get());
        }
    }

    public static void fail(String message) {
        if (message == null) {
            throw new AssertionError();
        }
        throw new AssertionError(message);
    }
}
