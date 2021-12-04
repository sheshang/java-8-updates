package com.java_8_training.examples.design.builder;

public class BuilderExampleMain {

    public static void main(String[] args) {

        Message incompleteMessage = Message.typeUnsafeBuilder()
                .sender(new Sender("hello@world.com"))
                .title("Hello")
                .content("World")
                .build();

        Message completeMessage = Message.builder()
                .sender(new Sender("hello@world.com"))
                .title("Hello")
                .content("World");

        System.out.println(incompleteMessage);
        System.out.println(completeMessage);
    }
}
