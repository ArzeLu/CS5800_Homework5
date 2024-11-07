package com.restaurant.fries;

import com.restaurant.Food;

/// Concrete decorator
public class FriesSaltDecorator extends FriesDecorator {
    public FriesSaltDecorator(Food fries) {
        super(fries);
    }

    // Equivalent to init() accessed by the client.
    @Override
    public void addTopping(){
        getToppings().add("Salt, $0.00");
        cost += 0;  // For uniformity
    }
}