package com.restaurant.customer;

public class Loyalty {
    // loyalty points
    private int points;

    Loyalty() {}

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    /// The customer gets 5 dollars off for every 100 points
    /// Very simplified model
    public double getDiscount(){
        int discountMultiplier = points / 100;
        points = points % 100;

        return (double)discountMultiplier * 5;
    }
}
