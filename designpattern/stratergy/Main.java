package org.example.designpattern.stratergy;

public class Main {

    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new UpiPaymentStrategy();
        ShoppingMall shoppingMall = new ShoppingMall(10, paymentStrategy);
        shoppingMall.makePayment();
    }
}
