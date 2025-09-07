package com.example.orders;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.ArrayList;
import java.util.List;

/**
 * Telescoping constructors + setters. Allows invalid states.
 */
public class Order {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines = new ArrayList<>();
    private final Integer discountPercent; // 0..100 expected, but not enforced
    private final boolean expedited;
    private final String notes;

    public Order(Builder builder) {
        this.id = builder.id;
        this.customerEmail = builder.customerEmail;
        this.discountPercent = builder.discountPercent;
        this.expedited = builder.expedited;
        this.notes = builder.notes;
        this.lines.addAll(builder.lines);
    }

    public static class Builder {
        private String id;
        private List<OrderLine> lines = new ArrayList<>();
        private String customerEmail;
        private Integer discountPercent; // 0..100 expected, but not enforced
        private boolean expedited;
        private String notes;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder customerEmail(String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }


        public Builder discountPercent(Integer discountPercent) {
            this.discountPercent = discountPercent;
            return this;
        }

        public Builder expedited(boolean expedited) {
            this.expedited = expedited;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }


        public Builder addLine(OrderLine line) { lines.add(line); return this; }

        public Builder addLines(List<OrderLine> lines) { this.lines.addAll(lines); return this; }

        public Order build() {
            if (id == null || id.isBlank()) throw new IllegalArgumentException("id is required");
            if (!PricingRules.isValidEmail(customerEmail)) throw new IllegalArgumentException("invalid email");
            if (!PricingRules.isValidDiscount(discountPercent)) throw new IllegalArgumentException("invalid discount");
            if(lines.size() == 0) throw new IllegalArgumentException("an order must have at least one line");
            return new Order(this);
        }
        
        
    }
    // public Order(String id, String customerEmail, Integer discountPercent) {
    //     this(id, customerEmail);
    //     this.discountPercent = discountPercent;
    // }

    // public void setDiscountPercent(Integer discountPercent) { this.discountPercent = discountPercent; }
    // public void setExpedited(boolean expedited) { this.expedited = expedited; }
    // public void setNotes(String notes) { this.notes = notes; }

    public String getId() { return id; }
    public String getCustomerEmail() { return customerEmail; }
    public List<OrderLine> getLines() { return new ArrayList<>(lines); } // leaks internal list
    public Integer getDiscountPercent() { return discountPercent; }
    public boolean isExpedited() { return expedited; }
    public String getNotes() { return notes; }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines) sum += l.getQuantity() * l.getUnitPriceCents();
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null) return base;
        return base - (base * discountPercent / 100);
    }
}
