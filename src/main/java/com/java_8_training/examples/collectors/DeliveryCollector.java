package com.java_8_training.examples.collectors;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class DeliveryCollector implements Collector<Delivery, DeliverySummary, DeliverySummary> {

    @Override
    public Supplier<DeliverySummary> supplier() {
        return DeliverySummary::new;
    }

    @Override
    public BiConsumer<DeliverySummary, Delivery> accumulator() {
        return (summary, quote) -> summary.add(quote.getPrice(), quote.getWeight(), quote.getItemCount());
    }

    @Override
    public BinaryOperator<DeliverySummary> combiner() {
        return (summaryLeft, summaryRight) -> {
            summaryLeft.add(
                    summaryRight.getTotalPrice(),
                    summaryRight.getTotalWeight(),
                    summaryRight.getTotalItemCount());
            return summaryLeft;
        };
    }

    @Override
    public Function<DeliverySummary, DeliverySummary> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(
                Characteristics.IDENTITY_FINISH,
                Characteristics.UNORDERED));
    }
}
