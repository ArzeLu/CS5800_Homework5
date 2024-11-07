package com.restaurant.coffee;

import com.restaurant.Food;

/// Concrete decorator
public class CoffeeCreamDecorator extends CoffeeDecorator {
    public CoffeeCreamDecorator(Food coffee) {
        super(coffee);
    }

    // Equivalent to init() accessed by the client.
    @Override
    public void addTopping(){
        toppings.add("Cream, $0.50");
        cost += 0.5;
    }
}