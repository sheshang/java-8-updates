package com.java_8_training.problems.design;

import org.junit.Test;

import java.util.concurrent.locks.LockSupport;

public class MiniAssertTest {

    @Test(expected = AssertionError.class)
    public void shouldErrorIfFalseIsTrue() {
        boolean isValid = true;
        MiniAssert.assertFalse(isValid, () -> generateExpensiveDiagnostic());
    }

    @Test
    public void shouldNotErrorIfFalseIsFalse() {
        boolean isValid = false;
        MiniAssert.assertFalse(isValid, () -> generateExpensiveDiagnostic());
    }

    @Test
    public void shouldNotErrorIfAssertSameIsSame() {
        Object o1 = new Object();

        MiniAssert.assertSame(o1, o1, () -> generateExpensiveDiagnostic());
    }

    @Test(expected = AssertionError.class)
    public void shouldErrorIfAssertSameIsDifferent() {
        Object o1 = new Object();
        Object o2 = new Object();

        MiniAssert.assertSame(o1, o2, () -> generateExpensiveDiagnostic());
    }

    private String generateExpensiveDiagnostic() {
        LockSupport.parkNanos(1_000_000_000);

        return "The missiles have been fired!";
    }

}
