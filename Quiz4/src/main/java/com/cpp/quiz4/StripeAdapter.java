package com.cpp.quiz4;

public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;
    private String cardholderName;
    private String cardNumber;
    private String expirationDate;

    public StripeAdapter(StripeGateway stripeGateway, String cardholderName, String cardNumber, String expirationDate) {
        this.stripeGateway = stripeGateway;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.makePayment(amount, cardholderName, cardNumber, expirationDate);
    }
}
