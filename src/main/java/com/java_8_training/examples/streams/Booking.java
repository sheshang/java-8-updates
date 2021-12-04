package com.java_8_training.examples.streams;

import java.util.Optional;

public class Booking
{
    static Optional<Booking> lookupBooking(final String reference)
    {
        return reference.startsWith("LCY")
            ? Optional.of(new Booking(reference))
            : Optional.empty();
    }

    private final String reference;

    Booking(final String reference)
    {
        this.reference = reference;
    }

    public String getReference()
    {
        return reference;
    }

    public String toString()
    {
        return "Booking{"+reference+"}";
    }
}

