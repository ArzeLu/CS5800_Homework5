package com.restaurant.fries;

import com.restaurant.Food;

import java.util.ArrayList;

/// Concrete component
public class OriginalFries implements Food {
    @Override
    public double getCost(){
        return 1.20;
    }

    @Override
    public void addTopping(){}

    @Override
    public ArrayList<String> getToppings(){
        return new ArrayList<>();
    }

    @Override
    public void viewInfo(){
        System.out.println("An order of Fries.");
    }
}
