package com.java_8_training.problems.datetime;

import java.time.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class BirthdayDiary {

    private Map<String, LocalDate> birthdays;

    public BirthdayDiary() {
        birthdays = new HashMap<>();
    }

    public LocalDate addBirthday(String name, int day, int month, int year) {
        birthdays.putIfAbsent(name, LocalDate.of(year, month, day));
        return birthdays.get(name);
    }

    public LocalDate getBirthdayFor(String name) {
        return birthdays.get(name);
    }

    public int getAgeInYear(String name, int year) {
        return year - birthdays.get(name).getYear();
    }

    public Set<String> getFriendsOfAgeIn(int age, int year) {
        return birthdays.entrySet().stream().filter(e -> (year - e.getValue().getYear()) == age).map(Map.Entry::getKey).collect(Collectors.toSet());
    }

    public Set<String> getBirthdaysIn(Month month) {
        return birthdays.entrySet().stream().filter(e -> e.getValue().getMonth().equals(month)).map(Map.Entry::getKey).collect(Collectors.toSet());
    }

    // Age here means the age of your birthday in a given year. So if this year is your 35th birthday
    // then your age in that year is 35.
    public int getTotalAgeInYears() {
        return birthdays.values().stream().mapToInt(localDate -> LocalDate.now().getYear() - localDate.getYear()).sum();
    }
}