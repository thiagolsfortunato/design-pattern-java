package com.pattern.example.demo.behavioral.chain_of_responsibility.src.example3;

import java.math.BigDecimal;

public class DiscountByValue implements Discount {

    private Discount next;

    @Override
    public void setNext(Discount next) {
        this.next = next;
    }

    @Override
    public BigDecimal calculate(Order order) {
        if(order.getTotal().compareTo(BigDecimal.valueOf(1000.0)) > 0) {
            return order.getTotal().multiply(BigDecimal.valueOf(0.10));
        }else {
            return next.calculate(order);
        }
    }
}
