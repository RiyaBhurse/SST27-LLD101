package com.example.orders;

import java.lang.module.ModuleDescriptor.Builder;

public class OrderLine {
    private final String sku;
    private final int quantity;
    private final int unitPriceCents;

    public OrderLine(Builder builder) {
        this.sku = builder.sku;
        this.quantity = builder.quantity;
        this.unitPriceCents = builder.unitPriceCents;
    }

    public static class Builder {
        private String sku;
        private int quantity;
        private int unitPriceCents;

        public Builder sku(String sku) {
            this.sku = sku;
            return this;
        }


        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder unitPriceCents(int unitPriceCents) {
            this.unitPriceCents = unitPriceCents;
            return this;
        }

        public OrderLine build() {
            
            return new OrderLine(this);
        }
    }

    public String getSku() { return sku; }
    public int getQuantity() { return quantity; }
    public int getUnitPriceCents() { return unitPriceCents; }

}
