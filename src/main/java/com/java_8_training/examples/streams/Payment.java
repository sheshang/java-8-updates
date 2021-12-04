package com.java_8_training.examples.streams;

public class Payment
{
    private final int value;

    public Payment(final int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return "Payment{" +
            "value=" + value +
            '}';
    }
}