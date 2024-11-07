package com.restaurant.fries;

import com.restaurant.Food;

/// Concrete decorator
public class FriesKetchupDecorator extends FriesDecorator {
    public FriesKetchupDecorator(Food fries) {
        super(fries);
    }

    // Equivalent to init() accessed by the client.
    @Override
    public void addTopping(){
        getToppings().add("Ketchup, $0.20");
        cost += 0.2;
    }
}