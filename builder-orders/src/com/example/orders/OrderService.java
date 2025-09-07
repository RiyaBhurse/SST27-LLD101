package com.example.orders;

import java.util.List;

public class OrderService {

    public Order createOrder(String id, String email, List<OrderLine> lines, Integer discount, boolean expedited, String notes) {
        Order o = new Order.Builder().id(id).customerEmail(email).discountPercent(discount).expedited(expedited).notes(notes).addLines(lines).build();
        // o.setExpedited(expedited);
        // o.setNotes(notes);
        return o;
    }
}
