package com.java_8_training.examples.datetime;

import java.time.*;
import java.util.Calendar;

/**
 * .
 */
public class TripExample {

    public static void main(String[] args) {
        // Flight from London to Amsterdam
        LocalDate date = LocalDate.of(2017, Month.JUNE, 8);
        LocalTime flightTime = LocalTime.parse("11:45");
        ZonedDateTime takeoff = ZonedDateTime.of(date, flightTime, ZoneId.of("Europe/Lannnnndaannnn"));

        // Arrival in Amsterdam
        ZonedDateTime touchdown = ZonedDateTime.of(date, LocalTime.of(14, 00), ZoneId.of("Europe/Amsterdam"));
        System.out.println(Duration.between(takeoff, touchdown));

        // How long have I been in Holland?

        final Clock clock = Clock.fixed(Instant.EPOCH, ZoneId.of("Europe/London"));
        final ZonedDateTime now = ZonedDateTime.now(clock);
        System.out.println(Duration.between(takeoff, now));

    }

}
