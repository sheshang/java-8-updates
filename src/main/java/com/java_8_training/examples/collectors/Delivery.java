package com.java_8_training.examples.collectors;

import java.math.BigDecimal;

public class Delivery {

    private BigDecimal price;
    private long weight;
    private long itemCount;

    public Delivery(BigDecimal price, long weight, long itemCount) {
        this.price = price;
        this.weight = weight;
        this.itemCount = itemCount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public long getWeight() {
        return weight;
    }

    public long getItemCount() {
        return itemCount;
    }
}
