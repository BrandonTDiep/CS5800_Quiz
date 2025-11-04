package com.cpp.quiz4;

public class SquareAdapter implements  PaymentProcessor {
    public SquareGateway squareGateway;
    private String locationID;

    public SquareAdapter(SquareGateway squareGateway, String locationID) {
        this.squareGateway = squareGateway;
        this.locationID = locationID;
    }

    @Override
    public void processPayment(double amount) {
        squareGateway.makePayment(amount, locationID);
    }
}
