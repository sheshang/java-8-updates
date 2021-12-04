package com.java_8_training.examples.collectors;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class DeliveryCollectorRunner {

    public static void main(String[] args) {
        Stream<Delivery> quotes = Stream.of(
                new Delivery(new BigDecimal(9.5), 10, 2),
                new Delivery(new BigDecimal(7.0), 3, 2),
                new Delivery(new BigDecimal(6.5), 5, 8));

        DeliverySummary deliverySummary = quotes.collect(new DeliveryCollector());

        System.out.println(deliverySummary);
    }

}
