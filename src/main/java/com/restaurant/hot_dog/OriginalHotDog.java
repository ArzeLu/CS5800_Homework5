package com.restaurant.hot_dog;

import com.restaurant.Food;

import java.util.ArrayList;

/// Concrete component
public class OriginalHotDog implements Food {
    @Override
    public double getCost(){
        return 3.50;
    }

    @Override
    public void addTopping(){}

    @Override
    public ArrayList<String> getToppings(){
        return new ArrayList<>();
    }

    @Override
    public void viewInfo(){
        System.out.println("An order of Hot Dog.");
    }
}
