package org.example.designpattern.stratergy;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void makePayment(int amount) {
        System.out.println("Making payment via debit card");
    }
}
