package com.java_8_training.examples.collectors;

import java.math.BigDecimal;

public class DeliverySummary {

    private BigDecimal totalPrice;
    private long totalWeight;
    private long totalItemCount;

    public DeliverySummary() {
        this(BigDecimal.ZERO, 0, 0);
    }

    public DeliverySummary(final BigDecimal totalVolume, final long totalSkids, final long totalItemCount) {
        this.totalPrice = totalVolume;
        this.totalWeight = totalSkids;
        this.totalItemCount = totalItemCount;
    }

    public void add(final BigDecimal price, final long weight, final long itemCount) {
        totalPrice = totalPrice.add(price);
        totalWeight += weight;
        totalItemCount += itemCount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public long getTotalWeight() {
        return totalWeight;
    }

    public long getTotalItemCount() {
        return totalItemCount;
    }

    @Override
    public String toString() {
        return "RateQuoteSummary{" +
                "totalPrice=" + totalPrice +
                ", totalWeight=" + totalWeight +
                ", totalItemCount=" + totalItemCount +
                '}';
    }
}
