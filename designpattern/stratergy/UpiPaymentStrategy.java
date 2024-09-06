package org.example.designpattern.stratergy;

public class UpiPaymentStrategy implements PaymentStrategy {
    @Override
    public void makePayment(int amount) {
        System.out.println("Payment via UPI");
    }
}
