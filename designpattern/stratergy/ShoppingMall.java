package org.example.designpattern.stratergy;

public class ShoppingMall {
    private int amount;
    private PaymentStrategy paymentStrategy;

    ShoppingMall(int amount, PaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment() {
        paymentStrategy.makePayment(amount);
    }
}
