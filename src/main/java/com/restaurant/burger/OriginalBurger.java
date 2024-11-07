package com.restaurant.burger;

import com.restaurant.Food;

import java.util.ArrayList;

/// Concrete component
public class OriginalBurger implements Food {
    @Override
    public double getCost(){
        return 4.15;
    }

    @Override
    public void addTopping(){}

    @Override
    public ArrayList<String> getToppings(){
        return new ArrayList<>();
    }

    @Override
    public void viewInfo(){
        System.out.println("An order of Burger.");
    }
}
