package com.java_8_training.examples.design.builder;

public class Sender {

    private final String id;

    public Sender(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Sender{" +
                "id='" + id + '\'' +
                '}';
    }
}
