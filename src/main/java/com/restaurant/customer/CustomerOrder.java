package com.restaurant.customer;

import com.restaurant.Food;

import java.util.ArrayList;

public class CustomerOrder {
    ArrayList<Food> foods;
    Boolean discountUsage = false;
    Loyalty loyalty;
    double discount = 0;

    /// The argument here is customer's loyalty points.
    /// This stat is the only variable likely to be static.
    public CustomerOrder(int points) {
        foods = new ArrayList<>();
        loyalty = new Loyalty();
        loyalty.setPoints(points);
    }

    public void addFood(Food food) {
        foods.add(food);
    }

    public void applyLoyaltyDiscount(Boolean discountUsage) {
        this.discountUsage = discountUsage;
    }

    public double getTotalPrice(){
        double total = 0;

        for(Food food : foods)
            total += food.getCost();

        if(discountUsage) {
            discount = loyalty.getDiscount();
            total = total - discount;
        }

        return total;
    }

    public void viewOrder(){
        for(Food food : foods)
            food.viewInfo();
    }

    public int getLoyaltyPoints(){
        return loyalty.getPoints();
    }

    public double getDiscountApplied(){
        return discount;
    }
}