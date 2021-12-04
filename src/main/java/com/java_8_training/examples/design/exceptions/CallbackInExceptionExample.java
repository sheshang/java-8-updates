package com.java_8_training.examples.design.exceptions;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.function.Consumer;

public class CallbackInExceptionExample {

    private static <T> void disappearingDrainTo(final Queue<T> queue, final Consumer<T> consumer) {
        while (true) {
            final T element = queue.poll();
            if (element == null) {
                return;
            }

            consumer.accept(element);
        }
    }

    private static <T> void catchingDrainTo(final Queue<T> queue, final Consumer<T> consumer) {
        while (true) {
            final T element = queue.poll();
            if (element == null) {
                return;
            }

            try {
                consumer.accept(element);
            } catch (Exception e) {
                queue.add(element);
                throw e;
            }
        }
    }

    private static <T> void drainTo(final Queue<T> queue, final Consumer<T> consumer) {
        final Iterator<T> iterator = queue.iterator();
        while (iterator.hasNext()) {
            final T element = iterator.next();

            consumer.accept(element);

            iterator.remove();
        }
    }

    public static void main(String[] args) {
        final Queue<String> values = new ArrayDeque<>();
        values.add("1");
        values.add("2");
        values.add("three");

        final Consumer<String> printPlus10 = str -> {
            final int number = Integer.parseInt(str);
            System.out.println(number + 10);
        };

        try {
            disappearingDrainTo(values, printPlus10);
            catchingDrainTo(values, printPlus10);
        } catch (final Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println(values);
        }
    }

}
