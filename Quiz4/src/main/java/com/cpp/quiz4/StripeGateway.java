package com.cpp.quiz4;

public class StripeGateway {
    public void makePayment(double paymentAmount, String cardholderName, String cardNumber, String expirationDate) {
        System.out.println("Stripe payment amount: " + paymentAmount + " , cardholder name " + cardholderName + " , card number " + cardNumber + " , expiration date " + expirationDate);
    }
}
