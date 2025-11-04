package com.cpp.quiz4;

public class Main {
    public static void main(String[] args) {
        PayPalGateway payPal = new PayPalGateway();
        StripeGateway stripe = new StripeGateway();
        SquareGateway square = new SquareGateway();

        PaymentProcessor paymentProcessor = new PayPalAdapter(payPal, "brandon@gmail.com");
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe, "Brandon Diep", "111-111-1111", "12/24");
        PaymentProcessor squareProcessor = new SquareAdapter(square, "123HAHA");

        paymentProcessor.processPayment(123.33);
        stripeProcessor.processPayment(432.11);
        squareProcessor.processPayment(24.24);
    }
}