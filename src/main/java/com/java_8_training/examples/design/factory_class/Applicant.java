package com.java_8_training.examples.design.factory_class;

public class Applicant {

    private final int age;
    private final String name;

    public Applicant(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
