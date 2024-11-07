package com.restaurant.coffee;

import com.restaurant.Food;

/// Concrete decorator
public class CoffeeSyrupDecorator extends CoffeeDecorator {
    public CoffeeSyrupDecorator(Food coffee) {
        super(coffee);
    }

    // Equivalent to init() accessed by the client.
    @Override
    public void addTopping(){
        getToppings().add("Syrup, $0.70");
        cost += 0.7;
    }
}